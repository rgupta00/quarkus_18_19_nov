package com.bookapp.controller;

import com.bookapp.dto.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "books")
    public List<Book> getAll(){
        return bookService.getAll();
    }
    @GetMapping(path = "books/{id}")
    public Book getOneBookById( @PathVariable int id){
        return bookService.getBookById(id);
    }
    @PostMapping(path = "books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        bookService.addBook(book);
        return  ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    //resp + status code: ResponseEntity
    @DeleteMapping(path = "books/{id}")
    public void deleteBook(@PathVariable("id")  long id){
        bookService.removeBook(id);
    }
}
