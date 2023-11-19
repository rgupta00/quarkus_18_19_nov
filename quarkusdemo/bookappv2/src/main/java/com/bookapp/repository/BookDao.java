package com.bookapp.repository;

import com.bookapp.dto.Book;

import java.util.List;

public interface BookDao {
	public List<Book> getAll();
	public Book getBookById(long bookId);
	public Book addBook(Book book);
	public Book updateBook(long bookId, Book book);
	public Book removeBook(long bookId);
	
}