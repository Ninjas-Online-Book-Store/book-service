package dev.codeninjas.book.service.ExceptionHandling;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }

}
