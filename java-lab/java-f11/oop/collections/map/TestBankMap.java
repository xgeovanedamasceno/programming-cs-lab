package oop.collections.map;

import oop.model.*;

public class TestBankMap {
    public static void main(String[] args) {
        Data today = new Data(11,3,2022);

        Account c1 = new SavingsAccount(today, "Peterson", "First Avenue");
        c1.cashDeposit(4697);

        Account c2 = new CheckingAccount(today, "Mary", "Second Avenue");
        c2.cashDeposit(789);

        BankMap bankAccounts = new BankMap();

        bankAccounts.addAccount(c1);

        bankAccounts.addAccount(c2);


        Account gotAccount = bankAccounts.getAccount(c1);
        System.out.println(gotAccount);

        System.out.println("Size: " + bankAccounts.totalAccounts());
    }

}
