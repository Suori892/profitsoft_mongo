package com.example.profitsoft_mongo_task.service.interfaces;

import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.example.profitsoft_mongo_task.dto.PersonDto;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 * Provide service for working with
 * Persons in peps collection
 */
public interface PersonService {
    /**
     * Method load zip file
     * which have json inside to mongodb
     * @param file for db
     */
    void upload(MultipartFile file);
    /**
     * Method return statistic about 10 most popular names
     * in peps collection
     * @return List with statistic
     */
    List<PepStatistic> getStatistic();
    /**
     * Method search full info about person
     * @param fullName of person
     * @return Dto of person
     */
    PersonDto search(String fullName);
}
