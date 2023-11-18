package com.bookapp.dto;

import java.time.LocalDateTime;

public class ErrorInfo {
    private String message;
    private String toContact;
    private String statusCode;
    private LocalDateTime timestamp;

    public ErrorInfo(String message, String toContact, String statusCode, LocalDateTime timestamp) {
        this.message = message;
        this.toContact = toContact;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
    }

    public ErrorInfo() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToContact() {
        return toContact;
    }

    public void setToContact(String toContact) {
        this.toContact = toContact;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
