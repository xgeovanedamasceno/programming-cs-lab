package oop.collections.hashcodes;

import oop.model.Account;
import oop.model.Data;
import oop.model.SavingsAccount;

import java.util.HashSet;

public class TestHashCode {
    public static void main(String[] args) {
        Data today = new Data(3,8,2022);
        Account c1 = new SavingsAccount(today, "Peterson", "First Avenue");
        c1.setFakeId(1);

        int hashC1 = c1.hashCode();
        System.out.println(hashC1);

        Account c2 = new SavingsAccount(today, "Maria", "First Avenue");
        c2.setFakeId(1);
        int hashC2 = c2.hashCode();
        System.out.println(hashC2);

        HashSet<Account> hashAccounts = new HashSet<>();
        hashAccounts.add(c1);
        hashAccounts.add(c2);

        System.out.println(hashAccounts);

        System.out.println(hashAccounts.size());



    }
}
