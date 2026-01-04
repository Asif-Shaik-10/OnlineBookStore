package com.jsp.bookstoreapplication.repo;

import org.springframework.data.repository.CrudRepository;

import com.jsp.bookstoreapplication.entitites.Purchase;

public interface Purchaserepo extends CrudRepository<Purchase, Integer>{

}
