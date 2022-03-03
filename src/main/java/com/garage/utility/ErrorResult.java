package com.garage.utility;

public class ErrorResult extends Result {

    public ErrorResult(String message) {
        super(false, message);
    }

    @Override
    public String getResultMessage() {
        return super.getMessage();
    }

}