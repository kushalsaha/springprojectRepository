/**
 * 
 */
package com.boot.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.learn.model.Book;

/**
 * @author Sanjeev
 *
 */
@RestController
@RequestMapping("/bookapp")
public class BookController {
	
	@GetMapping("/")
	public String appHomePage(){
		return "This is BookApp home page!";
	}

	@GetMapping("/allbooks")
	public List<Book> showAllBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Java-8", "Mala Gupta"));
		books.add(new Book(2, "ANT", "James"));
		books.add(new Book(3, "Spring-5", "Ian Gosling"));
		books.add(new Book(4, "Hibernate-4", "James Thomas"));
		books.add(new Book(5, "Github", "Richard Gere"));

		return books;
	}

}
