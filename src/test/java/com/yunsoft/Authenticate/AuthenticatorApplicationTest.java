package Mockito.Authenticate;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AuthenticatorApplicationTest {
    
    @Test
    public void testAuthenticate(){
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;
        final String username = "Admin";
        final String password = "password";

        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);

        when(authenticatorMock.authenticateUser(username, password)).thenReturn(false);

        final boolean actual = authenticator.authenticate(username, password);
        assertFalse(actual);     
    }
}