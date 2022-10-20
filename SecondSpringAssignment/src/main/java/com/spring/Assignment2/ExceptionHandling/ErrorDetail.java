package com.spring.Assignment2.ExceptionHandling;

import java.time.LocalDateTime;

/** Made a class for the custom error representation ***/
public class ErrorDetail {
    private LocalDateTime timeStamp;
    private String message;
    private String details;

    public ErrorDetail(LocalDateTime timeStamp, String message, String details) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
