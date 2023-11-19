package com.bookapp.providers;

import com.bookapp.dto.ErrorInfo;
import com.bookapp.exceptions.BookNotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.time.LocalDateTime;
@Provider
public class BookAppExHandler implements ExceptionMapper<BookNotFoundException> {

    @Override
    public Response toResponse(BookNotFoundException ex) {

            ErrorInfo errorInfo=new ErrorInfo();
            errorInfo.setTimestamp(LocalDateTime.now());
            errorInfo.setMessage(ex.getMessage());
            errorInfo.setStatusCode(Response.Status.NOT_FOUND.toString());
            errorInfo.setToContact("foo@foo.com");

            return Response.status(Response.Status.NOT_FOUND).entity(errorInfo).build();
        }
}

