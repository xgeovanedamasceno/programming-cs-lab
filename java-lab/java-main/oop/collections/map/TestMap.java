package oop.collections.map;

import oop.model.Account;
import oop.model.CheckingAccount;
import oop.model.SavingsAccount;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Account c1 = new CheckingAccount();
        c1.cashDeposit(1520);

        Account c2 = new SavingsAccount();
        c2.cashDeposit(4569);

        Map<String, Account> accountsMap = new HashMap();

        accountsMap.put("manager", c1);
        accountsMap.put("director", c2);

        Account directorAccount = accountsMap.get("director");
        System.out.println(directorAccount.getBalance());

    }
}
