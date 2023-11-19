package com.bookapp.providers;

import com.bookapp.dto.ErrorInfo;
import com.bookapp.exceptions.BookNotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.time.LocalDateTime;

//@Provider
//public class InternalServerExHandler implements ExceptionMapper<Exception> {
//
//    @Override
//    public Response toResponse(Exception ex) {
//
//            ErrorInfo errorInfo=new ErrorInfo();
//            errorInfo.setTimestamp(LocalDateTime.now());
//            errorInfo.setMessage(ex.getMessage());
//            errorInfo.setStatusCode(Response.Status.INTERNAL_SERVER_ERROR.toString());
//            errorInfo.setToContact("foo@foo.com");
//
//            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorInfo).build();
//        }
//}

