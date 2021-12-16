package com.example.SpringBootDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootDemo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#query-by-example
	List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name,String author);	
}