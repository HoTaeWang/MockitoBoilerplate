package com.yunsoft.Authenticator;

public class EmptyCredentialsException extends Exception {
    public EmptyCredentialsException(){
        super("Empty credentials");
    }
}
