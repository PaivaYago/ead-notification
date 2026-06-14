package com.ead.notification.excepitons;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
}
