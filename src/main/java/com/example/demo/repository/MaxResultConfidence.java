package com.example.demo.repository;

import com.example.demo.model.IntentMessage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface MaxResultConfidence extends Repository<IntentMessage,Integer> {
    @Query(value = "SELECT   MAX(confidence)  FROM IntentMessage")
    float getMaxResult();
}
