package com.example.profitsoft_mongo_task.repository;

import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.mongodb.BasicDBObject;
import java.util.List;

public interface PersonRepositoryCustom {
    List<PepStatistic> getStatistic();
    void insertBasicDBObject(BasicDBObject basicDBObject);
}
