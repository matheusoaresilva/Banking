package application;

import entities.Account;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {


        Account acc = new Account(1002, "Matheus", 0.0);
        BusinessAccount bacc = new BusinessAccount(1003, "Anna", 0.0, 1000.0);

        bacc.loan(200.0);

        System.out.print(bacc);
    }
}