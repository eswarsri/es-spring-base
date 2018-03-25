package com.es.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.spring.data.entities.Book;
import com.es.spring.data.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;
	
	public void save(Book book){
		this.repo.save(book);
	}
}