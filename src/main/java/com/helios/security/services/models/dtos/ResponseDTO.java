package com.helios.security.services.models.dtos;

public class ResponseDTO {
    private int numOfErrors;

    private String message;

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumOfErrors() {
        return numOfErrors;
    }

    public void setNumOfErrors(int numOfErrors) {
        this.numOfErrors = numOfErrors;
    }
}
