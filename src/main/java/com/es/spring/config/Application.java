package com.es.spring.config;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.es.spring.data.entities.Book;
import com.es.spring.service.BookService;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfiguration.class);
		BookService service = context.getBean(BookService.class);
		Book book = new Book("First book", new Date(), 55, new BigDecimal(40.00));
		service.save(book);
		
	}
}