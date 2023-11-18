package com.bookapp.service;

import com.bookapp.dto.Book;
import com.bookapp.repository.BookDao;
import com.bookapp.repository.BookDaoImplUsingMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

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