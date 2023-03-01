package com.example.profitsoft_mongo_task.repository;

import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.mongodb.BasicDBObject;
import java.util.List;

/**
 * Interface with additional custom methods
 */
public interface PersonRepositoryCustom {
    /**
     * Aggregation request which search top 10 names with amount of using
     * in pep database
     * @return List of names
     */
    List<PepStatistic> getStatistic();
    /**
     * Insert pep data to database
     * @param basicDBObject of pep
     * */
    void insertBasicDBObject(BasicDBObject basicDBObject);
}
