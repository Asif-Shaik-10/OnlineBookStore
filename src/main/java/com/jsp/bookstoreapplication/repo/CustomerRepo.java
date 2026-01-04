package com.jsp.bookstoreapplication.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.bookstoreapplication.entitites.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    
    Optional<Customer> findByName(String name);
     void deleteByName(String name);
     List<Customer> findAllByName(String name);
}