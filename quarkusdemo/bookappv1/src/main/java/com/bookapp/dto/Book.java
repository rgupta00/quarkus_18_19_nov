package com.bookapp.dto;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "b_table")
public class Book{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@NotEmpty
	private String isbn;

	@NotEmpty
	private String title;


	private String author;

	private double price;

	public Book(Long id, String isbn, String title, String author, double price) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(String isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Book{");
		sb.append("id=").append(id);
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append(", title='").append(title).append('\'');
		sb.append(", author='").append(author).append('\'');
		sb.append(", price=").append(price);
		sb.append('}');
		return sb.toString();
	}
}
