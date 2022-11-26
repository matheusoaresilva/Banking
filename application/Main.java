package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {


        Account acc = new Account(1002, "Matheus", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());


        Account acc2 = new SavingsAccount(1005, "Carlos", 1000.0,0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());


        BusinessAccount bacc = new BusinessAccount(1003, "Anna", 1000.0, 1000.0);
        bacc.withdraw(200.0);
        System.out.println(bacc.getBalance());


    }
}