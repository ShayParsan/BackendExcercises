package _1_introduction.exercise8;
import java.util.Scanner;

public class Application {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
    
            if (age >= 0 && age <= 120) {
                System.out.println("Ok");
            } else {
                System.out.println("Impossible!");
            }
    
            scanner.close();
        }
    }
    
