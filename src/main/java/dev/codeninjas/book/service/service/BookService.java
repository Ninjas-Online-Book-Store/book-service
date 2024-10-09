package dev.codeninjas.book.service.service;

import dev.codeninjas.book.service.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService{
    List<Book> findAll();
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    Optional<Book> findById(String id);
    Book saveBook(Book book);
    void deleteBook(String id);

}