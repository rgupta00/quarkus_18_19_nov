package com.bookapp.controller;

import com.bookapp.dto.Book;
import com.bookapp.dto.InvoiceConfiguration;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;
import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.List;
import java.util.Set;

@Path("/api")
public class BookController {

    @Inject
    private BookService bookService;

    @Inject
    private Validator validator;

    @Inject
    private InvoiceConfiguration invoiceConfiguration;

    @GET
    @Path("/books")
    public List<Book> getAll(){
        System.out.println(invoiceConfiguration);
        return bookService.getAll();
    }

    @GET
    @Path("/books/{id}")
    @Operation(summary = "getting an specfic books by id")
    @APIResponse(responseCode = "200", description = "getting book by id")
    @APIResponse(responseCode = "404", description = "book by id is not found")
    public Book getOneBookById( @PathParam("id") int id){
        return bookService.getBookById(id);
    }

    @POST
    @Path("/books")
    @Consumes("application/json")
    @Produces("application/json")
    public Response addBook(@Valid Book book){
        //Set<ConstraintViolation<CD>> violations = validator.validate(cd);
        //Set<ConstraintViolation<Book>> violations=  validator.validate(book);

//        if(violations.size()!=0){
//            System.out.println("-------------------------");
//        }
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
