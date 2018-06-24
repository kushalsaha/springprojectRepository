/**
 * 
 */
package com.learn.boot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learn.boot.exception.BookNotFoundException;
import com.learn.boot.model.Book;

/**
 * @author Sanjeev
 *
 */
@Component
public class BookRepository {

	private static List<Book> books = new ArrayList<>();

	static {
		Book b1 = new Book(1, "JavaBook", "James Gosling");
		Book b2 = new Book(2, "Python Book", "James Gosling");
		Book b3 = new Book(3, "KBC", "A Bachchan");
		Book b4 = new Book(4, "JavaBook4", "James Gosling");
		Book b5 = new Book(5, "JavaBook5", "James Gosling");
		Book b6 = new Book(6, "JavaBook6", "James Gosling");
		Book b7 = new Book(7, "JavaBook7", "James Gosling");
		Book b8 = new Book(8, "JavaBook8", "James Gosling");

		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
		books.add(b8);

	}

	public List<Book> retrieveAllBooks() {
		return books;
	}

	public Book getBookById(long bookId) {
		for (Book b : books) {
			if (b.getId() == bookId) {
				return b;
			}
		}
		throw new BookNotFoundException("Book doesn't exist with this Book id");
	}

	public Book addNewBook(Book book) {
		books.add(book);
		return book;
	}
	
	public Book updateBookDetails(long id){
		Book toUpdateBook = null;
		for (Book b : books) {
			if (b.getId() == id) {
				toUpdateBook = b;
				break;
			}
		}
		toUpdateBook.setAuthor("Kamal123");
		books.set(12, toUpdateBook);
		return toUpdateBook;
	}

}
