package _1_introduction.exercise5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = Integer.parseInt(scanner.nextLine());
        if (age< 18){
            System.out.println("Of age? No");
        } else {
            System.out.println("Of age? Yes");
        }
        scanner.close();
    }
}
