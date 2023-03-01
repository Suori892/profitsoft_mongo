package com.example.profitsoft_mongo_task.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Nested part of Person
 */
@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
public class RelatedCountry {
    @JsonProperty("date_established")
    @Field("date_established")
    String dateEstablished;
    @JsonProperty("date_finished")
    @Field("date_finished")
    String dateFinished;
    @JsonProperty("date_confirmed")
    @Field("date_confirmed")
    String dateConfirmed;
    @JsonProperty("to_country_en")
    @Field("to_country_en")
    String toCountryEn;
    @JsonProperty("to_country_uk")
    @Field("to_country_uk")
    String toCountryUk;
    @JsonProperty("relationship_type")
    @Field("relationship_type")
    String relationshipType;
}
