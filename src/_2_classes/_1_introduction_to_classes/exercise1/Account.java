package _2_classes._1_introduction_to_classes.exercise1;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        
        if (amount>balance) {
            throw new IllegalArgumentException("can't withdraw");

        } else {
            balance = balance - amount;

        }

        
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return name + ": " + balance;
    }
}
