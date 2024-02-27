package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Lucas", 2000.0, 0.01));
        list.add(new BusinessAccount(1002, "Carol", 4000.0, 400.0));

        double sum = 0.0;
        for(Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);
    }
}
