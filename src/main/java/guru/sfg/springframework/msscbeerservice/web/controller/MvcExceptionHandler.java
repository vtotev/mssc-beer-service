package guru.sfg.springframework.msscbeerservice.web.controller;

import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException ex) {
        List<String>errorsList = new ArrayList<>(ex.getConstraintViolations().size());
        ex.getConstraintViolations().forEach(e -> errorsList.add(e.toString()));
        return new ResponseEntity<>(errorsList, HttpStatus.BAD_REQUEST);
    }

}
