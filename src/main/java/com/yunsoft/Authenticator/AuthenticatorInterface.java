package com.yunsoft.Authenticator;

public interface AuthenticatorInterface {
    public boolean authenticateUser(String userName, String password) throws EmptyCredentialsException;
}
