package BankDemo;

public class Account {

    private double balance;

    // Set balance to 0
    public Account() {
        balance = 0.0;
    }

    //Create a deposit
    public void deposit (double amount) {
        balance = balance + amount;
    }

    //Create a withdrawal
    public void withdrawal(double amount){
        balance = balance- amount;
    }

    //Get Balance
    public double getBalance() {
        return balance;
    }
}
