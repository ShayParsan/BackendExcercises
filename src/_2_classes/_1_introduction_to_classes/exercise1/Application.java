package _2_classes._1_introduction_to_classes.exercise1;

public class Application {

    public static void main(String[] args) {
        Account l = new Account( "Max", 100);
        System.out.println(l.balance());
        l.deposit(20);
        l.withdraw(40);
        System.out.println(l.balance());

    }
}
