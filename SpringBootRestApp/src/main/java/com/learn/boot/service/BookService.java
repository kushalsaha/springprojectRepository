/**
 * 
 */
package com.learn.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.boot.dao.BookRepository;
import com.learn.boot.model.Book;

/**
 * @author Sanjeev
 *
 */
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.retrieveAllBooks();
	}

	public Book getBookById(long bookId) {
		return bookRepository.getBookById(bookId);
	}
	
	public Book addNewBook(Book book){
		return bookRepository.addNewBook(book);
	}
	
	public Book updateBook(long id){
		return bookRepository.updateBookDetails(id);
	}

}
