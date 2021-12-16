package com.example.SpringBootDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.entity.Book;




public interface BookService {
	
	public List<Book> findAll();
	public Book findById(int theId);
	public void save(Book theBook);
	public void deleteById(int theId);
	public List<Book> searchBy(String name, String author);

}
