package com.demo3.demo3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFount extends RuntimeException {
    public ProductNotFount(Long productId) {
        super(String.format("%d not found", productId));

    }
}
