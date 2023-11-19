package com.bookapp.service;

import com.bookapp.dto.Book;
import com.bookapp.repository.BookRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
@ApplicationScoped
@Transactional
public class BookServiceImpl implements BookService {
	@Inject
	private BookRepo bookRepo;

	@RestClient
	private IsbnGeneratorProxyService isbnGenerator;

	@Inject
	private Event<Book> bookAddedEvent;

	@Override
	public List<Book> getAll() {
		return bookRepo.listAll();
	}
	@Override
	public Book getBookById(long bookId) {
		return bookRepo.findById(bookId);
	}

	@Override
	@Fallback(fallbackMethod = "addBookFallback")
	@Timeout(2500)
	public Book addBook(Book book) {
		book.setIsbn(isbnGenerator.isbnGenerator());

		bookAddedEvent.fire(book);

		 bookRepo.persist(book);
		 return book;
	}

	public Book addBookFallback(Book book) {
		System.out.println("---aka dummy response---");
		return book;
	}

	@Override
	public Book updateBook(long bookId, Book book) {
		Book bookToUpdate= getBookById(bookId);
		bookToUpdate.setPrice(book.getPrice());

		 bookRepo.persist(bookToUpdate);
		 return bookToUpdate;
	}
	@Override
	public Book removeBook(long bookId) {
		Book bookToDelete= getBookById(bookId);
		 bookRepo.delete(bookToDelete);
		 return bookToDelete;
	}

}