package dev.codeninjas.book.service.service;

import dev.codeninjas.book.service.ExceptionHandling.BookNotFoundException;
import dev.codeninjas.book.service.domain.Book;
import dev.codeninjas.book.service.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Data
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    @Override
    public Optional<Book> findById(String id) {
        return Optional.of(bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with id " + id + " not found")));
    }
    @Override
    public List<Book> findAll() {
        assert bookRepository != null;
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.saveBook(book);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

}
