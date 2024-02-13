package _1_introduction.exercise3;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature here");
        double Temp_c = Double.parseDouble(scanner.nextLine());
        double Temp_f = (Temp_c * 9/5) + 32;
        double Temp_k = (Temp_c +  273.15);
        System.out.println("The temperature is " + Temp_c + " Celcius" + Temp_f + " Fahrenheit" + Temp_k + " kelvin" );
        scanner.close();


    }
}
