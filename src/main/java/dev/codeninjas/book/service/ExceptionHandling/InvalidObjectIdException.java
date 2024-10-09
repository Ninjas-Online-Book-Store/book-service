package dev.codeninjas.book.service.ExceptionHandling;

public class InvalidObjectIdException extends RuntimeException {

    public InvalidObjectIdException(String message) {
        super(message);
    }

}
