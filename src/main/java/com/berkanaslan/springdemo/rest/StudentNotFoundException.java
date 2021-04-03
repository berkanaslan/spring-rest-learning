package com.berkanaslan.springdemo.rest;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Berkan Aslan
 * 3.04.2021
 */

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
