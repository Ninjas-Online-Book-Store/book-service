package dev.codeninjas.book.service.repository;
import dev.codeninjas.book.service.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    public Optional<Book> findById(String id);
    public List<Book> findAll();
    public List<Book> findByTitle(String title);
    public List<Book> findByAuthor(String author);
    public Book saveBook(Book book);
    public void deleteBook(String id);


}
