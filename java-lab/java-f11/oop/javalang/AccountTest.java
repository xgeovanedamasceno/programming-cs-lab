package oop.javalang;

public class AccountTest {
    public static void main(String[] args) {

        System.out.println();

        Data today = new Data(9, 03, 2022);
        Account c1 = new CheckingAccount(today, "Jefferson", "7th Avenue");      
        c1.cashDeposit(5000);

        System.out.println(c1);

        System.out.println();

        Account c2 = new SavingsAccount(today, "Matthew", "8th Avenue");
        c2.cashDeposit(8966);

        System.out.println(c2);

        System.out.println();


    }
}
