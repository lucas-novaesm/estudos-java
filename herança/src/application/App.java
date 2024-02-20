package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Account acc = new Account(1001 , "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING: Refere-se à conversão de um objeto de uma classe mais específica para uma classe mais genérica na hierarquia de herança. 
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        

        //DOWNCASTING: Refere-se à conversão de um objeto de uma classe mais genérica para uma classe mais específica na hierarquia de herança.
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
    

    }
}
