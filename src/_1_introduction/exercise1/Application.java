package _1javaintroduction.basicsyntax.oefening1;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your first name?");
        String voornaam = scanner.nextLine();
        System.out.println("What is your surname?");
        String achternaam = scanner.nextLine();

        System.out.println("Hello " + voornaam + " " + achternaam + "!");
    }
}
