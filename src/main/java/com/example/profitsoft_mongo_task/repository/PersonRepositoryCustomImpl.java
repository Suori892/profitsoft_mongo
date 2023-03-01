package com.example.profitsoft_mongo_task.repository;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.limit;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.mongodb.BasicDBObject;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Repository;

/**
 * Realisation of PersonRepositoryCustom interface
 * */
@Repository
@RequiredArgsConstructor
public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {
    private static final String PEPS_COLLECTION_NAME = "peps";

    private final MongoTemplate mongoTemplate;
    @Override
    public List<PepStatistic> getStatistic() {
      Aggregation aggregation = newAggregation(
          match(where("is_pep").is(true)),
          group("first_name").count().as("amount"),
          sort(Sort.by(Sort.Direction.DESC, "amount")),
          limit(10)
      );

      AggregationResults<PepStatistic> result = mongoTemplate.aggregate(
          aggregation, PEPS_COLLECTION_NAME, PepStatistic.class
      );

      return result.getMappedResults();
    }
    @Override
    public void insertBasicDBObject(BasicDBObject basicDBObject) {
      mongoTemplate.insert(basicDBObject, PEPS_COLLECTION_NAME);
    }
}
