package _1_introduction.exercise6;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("enter second number");
        int num2 = Integer.parseInt(scanner.nextLine());
        if (num1 > num2){
            System.out.println(num1);
        } else if (num2>num1) {
            System.out.println(num2);

        } else {
            System.out.println(num1|num2);
        }
        scanner.close();

    }
}
