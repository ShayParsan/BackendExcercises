package _1_introduction.exercise10;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;

        while (num >= 0) {
            num = scanner.nextInt();
            if (num >= 0) {
                sum += num;
                count++;
            }
        }
        int avg = sum/count;
        System.out.println(sum +"go"+ count+ "hi"+ avg);

        scanner.close();


    } 
}
