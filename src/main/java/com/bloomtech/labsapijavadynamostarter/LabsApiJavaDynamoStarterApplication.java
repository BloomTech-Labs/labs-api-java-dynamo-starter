package com.bloomtech.labsapijavadynamostarter;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableDynamoDBRepositories
@SpringBootApplication
public class LabsApiJavaDynamoStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabsApiJavaDynamoStarterApplication.class, args);
    }
}
