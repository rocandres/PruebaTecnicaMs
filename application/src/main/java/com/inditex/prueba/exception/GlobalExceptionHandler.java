package com.inditex.prueba.exception;

import com.inditex.prueba.generated.model.Error;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handlerBadRequest(final Exception exception) {
        Error badRequest = new Error();
        badRequest.setCode(400);
        badRequest.setMessage(exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(badRequest);
    }
}
