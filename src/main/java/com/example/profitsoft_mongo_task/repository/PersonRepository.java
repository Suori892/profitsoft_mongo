package com.example.profitsoft_mongo_task.repository;

import com.example.profitsoft_mongo_task.data.Person;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository which has default MongoRepository methods
 * and extends custom methods from PersonRepositoryCustom.
 */
public interface PersonRepository extends MongoRepository<Person, String>, PersonRepositoryCustom {
    /**
     * Search all info about person in pep database
     * by full name
     * @param fullName name person in database
     * @return detailed info about person in Optional wrapper
     */
    Optional<Person> findByFullName(String fullName);
}
