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
public class RelatedCompany {
    @JsonProperty("relationship_type_en")
    @Field("relationship_type_en")
    String relationshipTypeEn;
    @JsonProperty("to_company_short_en")
    @Field("to_company_short_en")
    String toCompanyShortEn;
    @JsonProperty("date_established")
    @Field("date_established")
    String dateEstablished;
    @JsonProperty("to_company_edrpou")
    @Field("to_company_edrpou")
    String toCompanyEdrpou;
    @JsonProperty("to_company_founded")
    @Field("to_company_founded")
    String toCompanyFounded;
    @JsonProperty("date_finished")
    @Field("date_finished")
    String dateFinished;
    @JsonProperty("to_company_is_state")
    @Field("to_company_is_state")
    boolean toCompanyIsState;
    @JsonProperty("share")
    @Field("share")
    String share;
    @JsonProperty("date_confirmed")
    @Field("date_confirmed")
    String dateConfirmed;
    @JsonProperty("to_company_uk")
    @Field("to_company_uk")
    String toCompanyUk;
    @JsonProperty("to_company_short_uk")
    @Field("to_company_short_uk")
    String toCompanyShortUk;
    @JsonProperty("to_company_en")
    @Field("to_company_en")
    String toCompanyEn;
    @JsonProperty("relationship_type_uk")
    @Field("relationship_type_uk")
    String relationshipTypeUk;
}

