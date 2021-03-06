package com.example.mongodbapp.Repository;

import com.example.mongodbapp.Model.Customer;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName (String firstName);
    public List<Customer> findByLastName(String lastName);

}
