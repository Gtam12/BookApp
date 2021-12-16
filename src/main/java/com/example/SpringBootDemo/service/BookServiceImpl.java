package com.example.SpringBootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBootDemo.entity.Book;
import com.example.SpringBootDemo.repository.BookRepository;



@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	@Override
	@Transactional
	public List<Book> findAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	@Transactional
	public Book findById(int theId) {
		return bookRepository.findById(theId).get();
	}

	@Override
	@Transactional
	public void save(Book theBook) {
		bookRepository.save(theBook);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		bookRepository.deleteById(theId);
	}

	@Override
	@Transactional
	public List<Book> searchBy(String name, String author) {
		List<Book> books = bookRepository.findByNameContainsAndAuthorContainsAllIgnoreCase(name, author);
		return books;
	}
	
}
