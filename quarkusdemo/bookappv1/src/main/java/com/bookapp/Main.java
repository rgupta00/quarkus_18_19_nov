package com.bookapp;

import com.bookapp.dto.Book;
import com.bookapp.repository.BookRepo;
import com.bookapp.service.BookService;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
//QuarkusApplication => commandlinerunner
@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private BookService bookService;

    public static void main(String[] args) {
        System.out.println("==================main===============");
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("==================run(String... args) ===============");
        //String isbn, String title, String author, double price
        bookService.addBook(new Book("143545ASB","java is best","raj",700.00));
        Quarkus.waitForExit();
        return 0;
    }
}
