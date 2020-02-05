package com.example.mongodbapp;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbAppApplication.class, args);

    }

}
