package com.yunsoft;

import com.yunsoft.accountservice.Account;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

public class AccountServiceMainTest {
    AccountServiceMain accountService = new AccountServiceMain();

    @Test
    public void testCreateNewAccount(){
        Account newAccount = new Account();
        newAccount.setName("Bluray DVD");
        newAccount.setDescription("This is the Bluray DVD description");

        Account newAccountInserted = accountService.createNewAccount(newAccount);

        // Check if the account has the same composition
        //assertThat(newAccount, isA(Account.class));
        assertEquals(newAccount.getName(), newAccountInserted.getName());
    }

    @Test
    public void testUpdateAccount() {


        //	The old account (assumed that this came from a database or mock)
        Account oldAccount = new Account();
        oldAccount.setName("Alvin Reyes");
        oldAccount.setDescription("This is the description");

        String name = oldAccount.getName();
        //	Check if the account is still the same. it is expected to be different since we updated it.
        Account expectedAccountObj =  new Account();
        expectedAccountObj = accountService.updateAccount(oldAccount);
        assertThat(expectedAccountObj, isA(Account.class));
        assertNotEquals(name, expectedAccountObj.getName());

    }

    @Test
    public void testRemoveAccount() {

        //	Set up the account to be removed.
        Account toBeRemovedAccount = new Account();
        toBeRemovedAccount.setName("Alvin Reyes");
        toBeRemovedAccount.setDescription("This is the description");

        //	Removed the account.
        assertTrue(accountService.removeAccount(toBeRemovedAccount));

    }

    @Test
    public void testListAllTransactions() {
        //	 Dummy Transactions (can be mocked via mockito)
        Account account = new Account();
        account.setName("Alvin Reyes");
        //	Service gets all transaction
        accountService.listAllTransactions(account);
        //	Check if there are transactions.
        assertTrue(accountService.listAllTransactions(account).size() > 1);
    }

}