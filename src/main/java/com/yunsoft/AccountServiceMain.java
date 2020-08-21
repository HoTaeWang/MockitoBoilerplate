package com.yunsoft;

import com.yunsoft.accountservice.Account;
import com.yunsoft.accountservice.AccountService;
import com.yunsoft.accountservice.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceMain implements AccountService {

    @Override
    public Account createNewAccount(Account account) {
        //	Dummy Dao! Database insert here.
        //	accountDao.insert(account);
        //	Ultimately return the account with the modification.
        return account;
    }

    @Override
    public Account updateAccount(Account account) {
        //	Dummy Dao! Database insert here.
        //	accountDao.update(account);
        //	Ultimately return the account with the modification.
        account.setName("Alvin Reyes: New Name");
        return account;
    }

    @Override
    public boolean removeAccount(Account account) {
        //	Dummy Dao! Database insert here.
        //	accountDao.delete(account);
        //	Ultimately return the account with the modification.
        //	if exception occurs, return false.
        return true;
    }

    @Override
    public List<Transaction> listAllTransactions(Account account) {
        // accountDao.loadAllTransactions(account);
        List<Transaction> listOfAllTransactions = new ArrayList<Transaction>();
        listOfAllTransactions.add(new Transaction());
        listOfAllTransactions.add(new Transaction());
        listOfAllTransactions.add(new Transaction());
        account.setTransactions(listOfAllTransactions);

        return listOfAllTransactions;
    }
}
