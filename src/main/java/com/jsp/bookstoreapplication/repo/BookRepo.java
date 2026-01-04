package com.jsp.bookstoreapplication.repo;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.jsp.bookstoreapplication.entitites.Books;

public interface BookRepo extends CrudRepository<Books, Integer> {

	
	Optional<Books> findByBid(Integer id);
    Optional<Books> findByBname(String bname);
    Optional<Books> findByprice(String price);
}