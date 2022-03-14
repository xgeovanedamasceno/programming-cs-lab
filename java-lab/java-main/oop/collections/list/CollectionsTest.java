package oop.collections.list;

import oop.model.Account;
import oop.model.CheckingAccount;
import oop.model.Data;
import oop.model.SavingsAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {

        Data today = new Data(9,3,2022);
        Account c1 = new CheckingAccount(today, "Peterson", "4th Avenue");

        Account c2 = new SavingsAccount(today, "Beth", "4th Avenue");

        Account c3 = new SavingsAccount(today, "Matthew", "5th Avenue");

        Account c4 = new CheckingAccount(today, "Abraham", "4th Avenue");

        List<Account> myAccounts = new ArrayList<>();
        myAccounts.add(c1);
        myAccounts.add(c2);
        myAccounts.add(c3);
        myAccounts.add(c4);

        System.out.println();

        System.out.println(myAccounts);

        System.out.println();
        System.out.println("Sort");

        Collections.sort(myAccounts);

        System.out.println(myAccounts);

        System.out.println("Reverse");
        Collections.reverse(myAccounts);

        System.out.println(myAccounts);



    }
}
