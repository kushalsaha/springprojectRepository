/**
 * 
 */
package com.learn.boot.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learn.boot.model.Book;
import com.learn.boot.service.BookService;

/**
 * @author Sanjeev
 *
 */
@RestController
@RequestMapping("BookApp")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String home() {
		return "SpringBoot Application - Hello World!";
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/{bookid}")
	public Book retrieveBookById(@PathVariable long bookid) {
		return bookService.getBookById(bookid);
	}

	@PostMapping("/books")
	public ResponseEntity<Object> addNewBook(@RequestBody Book book) {
		Book savedBook = bookService.addNewBook(book);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedBook.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/books/{bid}")
	public Book updateBook(@PathVariable long bid){
		Book bk = bookService.getBookById(bid);
		if(bk == null){
			ResponseEntity.notFound().build();
		}
		return bookService.updateBook(bid);
	}

}
