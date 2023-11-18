package com.bookapp.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

import java.util.UUID;

@ApplicationScoped
@Alternative
public class NewIsbnGenerator implements IsbnGenerator{
    @Override
    public String generateIsbn() {
        return "new "+ UUID.randomUUID().toString();
    }
}
