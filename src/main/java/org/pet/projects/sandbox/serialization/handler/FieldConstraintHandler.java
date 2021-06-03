package org.pet.projects.sandbox.serialization.handler;

import org.pet.projects.sandbox.serialization.model.error.Error;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class FieldConstraintHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<Error> handleField(MethodArgumentNotValidException e) {
        List<Error> errors = new ArrayList<>();
        e.getBindingResult().getAllErrors().forEach(error -> {
            String name = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.add(new Error().setMessage(errorMessage).setFieldName(name));
        });
        return errors;
    }

}
