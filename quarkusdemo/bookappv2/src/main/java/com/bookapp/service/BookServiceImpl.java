package com.bookapp.service;

import com.bookapp.dto.Book;
import com.bookapp.dto.InvoiceConfiguration;
import com.bookapp.repository.BookDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
@ApplicationScoped
public class BookServiceImpl implements BookService {

	@Inject
	private BookDao bookDao;

	@Inject
	private IsbnGenerator isbnGenerator;
	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}
	@Override
	public Book getBookById(long bookId) {
		return bookDao.getBookById(bookId);
	}
	@Override
	public Book addBook(Book book) {
		book.setIsbn(isbnGenerator.generateIsbn());

		return bookDao.addBook(book);
	}
	@Override
	public Book updateBook(long bookId, Book book) {
		return bookDao.updateBook(bookId, book);
	}
	@Override
	public Book removeBook(long bookId) {
		return bookDao.removeBook(bookId);
	}

}