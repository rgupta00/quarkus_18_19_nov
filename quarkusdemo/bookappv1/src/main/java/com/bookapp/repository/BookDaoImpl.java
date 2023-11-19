//package com.bookapp.repository;
//
//import com.bookapp.dto.Book;
//import jakarta.enterprise.context.ApplicationScoped;
//import jakarta.inject.Inject;
//import jakarta.persistence.EntityManager;
//import jakarta.transaction.Transactional;
//import jakarta.transaction.UserTransaction;
//
//import java.util.List;
//@Transactional
//@ApplicationScoped
//public class BookDaoImpl implements BookDao{
//
//    @Inject
//    private EntityManager em;
//
//    @Inject
//    private UserTransaction userTransaction;
//
//    @Override
//    public List<Book> getAll() {
//        return em.createQuery("select b from Book b").getResultList();
//    }
//
//    @Override
//    public Book getBookById(long bookId) {
//        return null;
//    }
//
//    @Override
//    public Book addBook(Book book) {
//        try{
//            userTransaction.begin();
//
//            userTransaction.commit();
//        }catch (Exception e){
//
//        }
//        return null;
//    }
//
//    @Override
//    public Book updateBook(long bookId, Book book) {
//        return null;
//    }
//
//    @Override
//    public Book removeBook(long bookId) {
//        return null;
//    }
//}
