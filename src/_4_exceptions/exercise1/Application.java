package _4_exceptions.exercise1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            while (true) {
                System.out.print("Enter a number (or 'end' to finish): ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("end")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number or 'end'.");
                }
            }

            if (!numbers.isEmpty()) {
                double sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                double average = sum / numbers.size();
                System.out.println("Average of entered numbers: " + average);
            } else {
                System.out.println("No numbers entered.");
            }
       
        } finally {
            scanner.close();
        }
    }
}

