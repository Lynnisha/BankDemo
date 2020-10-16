package BankDemo;

import BankDemo.Account;

public class BankMain {

        public static void main (String[] args) {
          //Create cust1
            Account cust1 = new Account(); //Create an account object
          cust1.deposit(500);

          //Create cust2
            Account cust2 = new Account();
            cust2.deposit(100);

            System.out.println(cust1.getBalance());
            System.out.println(cust2.getBalance());
        }
}
