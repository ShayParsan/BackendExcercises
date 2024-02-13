package _1_introduction.exercise2;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = Integer.parseInt(Scanner.nextLine());
        System.out.println("Enter number 2");
        int num2 = Integer.parseInt(Scanner.nextLine());
        System.out.println("Enter number 3");
        int num3 = Integer.parseInt(Scanner.nextLine());
        System.out.println("The sum is " + (num1 + num2 + num3));
        System.out.println("The average is " + (num1 + num2 + num3)/3);

        Scanner.close();


    }
}
