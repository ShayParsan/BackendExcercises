package _1_introduction.exercise11;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int intial = 0;
        while (intial < num){
            for (int i = 0; i <= intial ; i ++){
                System.out.print("*");
            }
            System.out.println();
            intial ++;
        }
        scanner.close();
    }
}
