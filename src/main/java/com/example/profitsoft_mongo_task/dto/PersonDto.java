package com.example.profitsoft_mongo_task.dto;

import com.example.profitsoft_mongo_task.data.Person;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class PersonDto {
     String firstName;
     String lastName;
     String patronymic;
     String fullName;
     String dateOfBirth;
     String typeOfOfficial;
     boolean died;
     boolean isPep;

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
