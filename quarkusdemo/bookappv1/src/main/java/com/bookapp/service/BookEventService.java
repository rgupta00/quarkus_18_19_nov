package com.bookapp.service;

import com.bookapp.dto.Book;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class BookEventService {

    public void addBook(@Observes Book book){
        System.out.println(book);
        System.out.println("----------------------**********----------------");
    }

}
