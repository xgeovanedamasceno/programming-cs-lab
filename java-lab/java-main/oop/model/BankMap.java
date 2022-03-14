package oop.model;

import java.util.*;

public class BankMap {
    Map<String, Account> accounts = new HashMap();

    public void addAccount(Account newAcc) {
        accounts.put(newAcc.getHolder(), newAcc);
    }

    public Account getAccount(Account account) {
        return accounts.get(account.getHolder());
    }

    public int totalAccounts() {
        return accounts.size();
    }
}
