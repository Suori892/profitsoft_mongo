package com.example.profitsoft_mongo_task.service.implementations;


import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.example.profitsoft_mongo_task.data.Person;
import com.example.profitsoft_mongo_task.dto.PersonDto;
import com.example.profitsoft_mongo_task.exception.PersonNotFoundException;
import com.example.profitsoft_mongo_task.repository.PersonRepository;
import com.example.profitsoft_mongo_task.service.interfaces.PersonService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Realisation of PersonService
 */
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

  private final PersonRepository repository;

  @Override
  public void upload(MultipartFile file) {

      repository.deleteAll();

      try (ZipInputStream zis = new ZipInputStream(file.getInputStream());
           BufferedReader br = new BufferedReader(new InputStreamReader(zis))) {
        ZipEntry zipEntry = zis.getNextEntry();

        while (zipEntry != null) {
          if (!zipEntry.isDirectory() && zipEntry.getName().endsWith(".json")) {
            StringBuilder json = new StringBuilder();

            String inputString;

            while((inputString = br.readLine()) != null) {
              json.append(inputString);
            }

            BasicDBObject[] pepsBDBOArray = JSON_MAPPER.readValue(json.toString(), BasicDBObject[].class);

            for (BasicDBObject basicDBObject : pepsBDBOArray) {
              repository.insertBasicDBObject(basicDBObject);
            }
          }

          zipEntry = zis.getNextEntry();
        }

        zis.closeEntry();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    @Override
    public List<PepStatistic> getStatistic() {
       return repository.getStatistic();
    }
    @Override
    public PersonDto search(String fullName) {
        Person person = repository.findByFullName(fullName)
            .orElseThrow(() -> new PersonNotFoundException(fullName + " not found"));
        return PersonDto.createPepDTO(person);
    }
}
