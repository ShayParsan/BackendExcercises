package _1_introduction.exercise7;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first word");
        String char1 = scanner.nextLine();
        System.out.println("enter second word");
        String char2 = scanner.nextLine();
        if (char1.equals(char2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        scanner.close();
    }
}
