package _3_arrays_collections.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<String> words = new ArrayList<String>(); // here we setup a list into making a new array.
        boolean isNotEmpty = true; // checks if the input isn't empty

        while (isNotEmpty) {
            System.out.println("enter your input");
            String one = scanner.nextLine(); //scans input & stores it in the memory
            if (one.contains("av")){
                words.add(one); // filters the lines
            }
            if (one == ""){
                isNotEmpty = false; // input check
            }
        }
        for (String one : words) {
            System.out.println(one); // loops through the array & prints out every line.
        }
    }
}



