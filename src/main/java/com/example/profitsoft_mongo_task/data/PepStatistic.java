package com.example.profitsoft_mongo_task.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Data structure which consist
 * 10 most popular names in peps collection
 */
@Builder
@Getter
@Setter
public class PepStatistic {
    @Id
    private String firstName;
    private Integer amount;
}
