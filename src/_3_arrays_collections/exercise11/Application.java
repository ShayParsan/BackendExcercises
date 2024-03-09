package _3_arrays_collections.exercise11;

import java.util.Scanner;

public class Application {

    private Warehouse warehouse;
    private Scanner scanner;

    public Application(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

           
            if (warehouse.price(product) != -99 && warehouse.stock(product) > 0) {
                cart.add(product, warehouse.price(product));
                warehouse.take(product);
                System.out.println(product + " added to cart.");
            } else {
                System.out.println("Sorry, " + product + " is not available.");
            }
        }

        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Application store = new Application(warehouse, scanner);
        store.shop("John");

        
        scanner.close();
    }
}

