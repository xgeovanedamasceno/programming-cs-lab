package oop.collections.list;

import oop.model.*;

public class TestBankList {
    public static void main(String[] args) {
        Data today = new Data(11,3,2022);

        Account c1 = new SavingsAccount(today, "Peterson", "First Avenue");
        c1.cashDeposit(4697);

        Account c2 = new CheckingAccount(today, "Mary", "Second Avenue");
        c2.cashDeposit(789);

        Bank bankAccounts = new Bank();

        boolean added = bankAccounts.addAccount(c1);
        System.out.println(added);
        added = bankAccounts.addAccount(c2);
        System.out.println(added);


        Account gotAccount = bankAccounts.getAccount(1);
        System.out.println(gotAccount);

        System.out.println("Size: " + bankAccounts.totalAccounts());
    }
}
