package dev.codeninjas.book.service.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleBookNotFoundException(BookNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(InvalidObjectIdException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidObjectIdException(InvalidObjectIdException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return ex.getMessage();
    }
}
