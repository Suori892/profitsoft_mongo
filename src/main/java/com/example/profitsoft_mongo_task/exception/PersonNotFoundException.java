package com.example.profitsoft_mongo_task.exception;

/**
 * Exception if person wasn't found
 * in peps collection by request
 */
public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(String message) {
        super(message);
    }
}
