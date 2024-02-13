package _1_introduction.exercise14;

public class Application {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));
        System.out.println("Division: " + div(a, b));

    }
    public static double add(int num1, int num2) {
        return num1 + num2;
    }

    public static double sub(int num1, int num2) {
        return num1 - num2;
    }

    public static double mul(int num1, int num2) {
        return num1 * num2;
    }

    public static double div(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}
