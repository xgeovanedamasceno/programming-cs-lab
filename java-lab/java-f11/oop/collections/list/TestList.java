package oop.collections.list;

import oop.model.Account;
import oop.model.CheckingAccount;
import oop.model.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestList {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();

        Random maxNumber = new Random();
        int maxNumberAccounts = maxNumber.nextInt(20);

        System.out.println(maxNumberAccounts);

        Data today = new Data(11,3,2022);


        for (int i = 0; i < maxNumberAccounts; i++) {
            Account acc = new CheckingAccount(today, "Client" + i, i + "th Avenue");
            double value = Math.random() * 2000;
            acc.cashDeposit(value);

            accounts.add(acc);
        }

        System.out.println(accounts);



    }
}
