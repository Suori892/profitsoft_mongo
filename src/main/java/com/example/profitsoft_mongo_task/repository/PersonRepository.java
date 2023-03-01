package com.example.profitsoft_mongo_task.repository;

import com.example.profitsoft_mongo_task.data.Person;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PersonRepository extends MongoRepository<Person, String>, PersonRepositoryCustom {
    Optional<Person> findByFullName(String fullName);
}
