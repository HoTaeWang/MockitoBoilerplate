package com.yunsoft.Authenticator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AuthenticatorApplicationTest {

    @Test
    public void testAuthenticate() throws EmptyCredentialsException {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;

        String strUserName = "APNC";
        String password = "5tkatjd!";

        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);

        when(authenticatorMock.authenticateUser(strUserName, password)).thenReturn(false);

        boolean actual = authenticator.authenticate(strUserName, password);
        assertFalse(actual);
    }

    @Test(expected = EmptyCredentialsException.class)
    public void testAuthenticateEmptyCredentialsException() throws EmptyCredentialsException {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;

        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);

        when(authenticatorMock.authenticateUser("", ""))
                .thenThrow(new EmptyCredentialsException());

        authenticator.authenticate("", "");
    }

//    @Test
//    public void testAuthenticateMockInjection() throws EmptyCredentialsException {
//        String username = "admin";
//        String password = "5tkatjd!!";
//
//        when(this)
//    }
}
