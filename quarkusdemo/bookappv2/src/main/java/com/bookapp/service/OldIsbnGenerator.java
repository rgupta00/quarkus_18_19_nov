package com.bookapp.service;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;
@ApplicationScoped
public class OldIsbnGenerator implements IsbnGenerator{
    @Override
    public String generateIsbn() {
        return "old "+ UUID.randomUUID().toString();
    }
}
