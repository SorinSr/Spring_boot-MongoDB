package com.example.mongodbapp.Controller;

import com.example.mongodbapp.Model.Customer;
import com.example.mongodbapp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> test() {
        System.out.println(customerRepository.findAll());
        return customerRepository.findAll();

//        customerRepository.deleteAll();

        // save a couple of customers
//        customerRepository.save(new Customer("Alice", "Smith"));
//        customerRepository.save(new Customer("Bob", "Smith"));
//        customerRepository.save(new Customer("Nate", "Smith"));
//        customerRepository.save(new Customer("Alex", "Smith"));
//        customerRepository.save(new Customer("Dave", "Kent"));
//        customerRepository.save(new Customer("Sue", "Dave"));
//        customerRepository.save(new Customer("John", "Doe"));

//        // fetch all customers
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Customer customer : customerRepository.findAll()) {
//            System.out.println(customer);
//            return customer;
//        }
//        System.out.println();

        // fetch an individual customer
//        System.out.println("Customer found with findByFirstName('Bob'):");
//        System.out.println("--------------------------------");
//        if (customerRepository.findByFirstName("Bob") != null) {
//            System.out.println(customerRepository.findByFirstName("Bob"));
//            return customerRepository.findByFirstName("Bob");
//        } else {
//            return null;
//        }


//        System.out.println("Customer found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        if (customerRepository.findByLastName("Smith") != null) {
//            ArrayList<Customer> customerArrayList = new ArrayList<>();
//            for (Customer customer : customerRepository.findByLastName("Smith")) {
//                System.out.println(customer);
//                customerArrayList.add(customer);
//            }
//            return customerArrayList;
//        } else {
//            return null;
//        }

//        System.out.println("Customers found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (Customer customer : customerRepository.findByLastName("Smith")) {
//            System.out.println(customer);
//        }

    }
}