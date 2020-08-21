package Mockito.Authenticate;

public class AuthenticatorApplication {
    private AuthenticatorInterface mAuth = null;

    public AuthenticatorApplication(AuthenticatorInterface iAuth){
        mAuth = iAuth;
    }

    public boolean authenticate(String username, String password){
        boolean bAuthenticated;
        bAuthenticated = this.mAuth.authenticateUser(username, password);
        return bAuthenticated;
    }

    public static void main(String[] args) {
        System.out.println("Authenticate Test");
        //AuthenticatorApplication application = new AuthenticatorApplication(iAuth)
    }
    
}