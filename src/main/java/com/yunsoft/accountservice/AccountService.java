package com.yunsoft.accountservice;

import java.util.List;

public interface AccountService {

    public Account createNewAccount(Account account);
    public Account updateAccount(Account account);
    public boolean removeAccount(Account account);
    public List<Transaction> listAllTransactions(Account account);
}
