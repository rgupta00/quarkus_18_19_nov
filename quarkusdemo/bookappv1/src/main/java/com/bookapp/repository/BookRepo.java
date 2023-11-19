package com.bookapp.repository;

import com.bookapp.dto.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class BookRepo implements PanacheRepository<Book> {
//    public Optional<Book> findByTitle(String title){
//        return find("title", title).stream().findFirst();
//    }
}
