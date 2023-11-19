package com.bookapp.controller;

import com.bookapp.dto.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;
@Path("/api")
public class BookController {

    private BookService bookService;

    @Inject
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Path("/books")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GET
    @Path("/books/{id}")
    public Book getOneBookById( @PathParam("id") int id){
        return bookService.getBookById(id);
    }
    @POST
    @Path("/books")
    @Consumes("application/json")
    @Produces("application/json")
    public Response addBook(Book book){
        bookService.addBook(book);
        return  Response.status(Response.Status.CREATED).entity(book).build();
    }

    @PUT
    @Path("/books/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Book updateBook(@PathParam("id")  long id, Book book){
        bookService.updateBook(id, book);
        return  book;
    }

    //SB: ResponseEntity
    //q: Response
    @DELETE
    @Path("/books/{id}")
    @Produces("application/json")
    public Response deleteBook(@PathParam("id")  long id){
        bookService.removeBook(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
