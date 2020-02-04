package com.example.mongodbapp;

import com.example.mongodbapp.Model.Customer;
import com.example.mongodbapp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(MongodbAppApplication.class, args);
	}

}
