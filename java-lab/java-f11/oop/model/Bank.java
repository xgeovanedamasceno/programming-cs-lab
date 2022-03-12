package oop.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    public boolean addAccount(Account newAcc) {
        boolean added = accounts.add(newAcc);
        if (added)
            return true;
        return false;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public int totalAccounts() {
        return accounts.size();
    }
}
