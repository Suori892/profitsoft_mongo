package com.example.profitsoft_mongo_task.dto;

import com.example.profitsoft_mongo_task.data.Person;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonDto {
    private String id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String fullName;
    private String dateOfBirth;
    private String typeOfOfficial;
    private boolean died;
    private boolean isPep;

    public static PersonDto createPepDTO(Person person){
      return PersonDto.builder()
          .firstName(person.getFirstName())
          .lastName(person.getLastName())
          .patronymic(person.getPatronymic())
          .fullName(person.getFullName())
          .dateOfBirth(person.getDateOfBirth())
          .typeOfOfficial(person.getTypeOfOfficial())
          .died(person.isDied())
          .isPep(person.isPep())
          .build();
    }
}
