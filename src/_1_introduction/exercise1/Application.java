package _1javaintroduction.basicsyntax.oefening1;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your surname?");
        String lastName = scanner.nextLine();

        System.out.println("Hello " + firstName + " " + lastName + "!");
    }
}