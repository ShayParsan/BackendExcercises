package _3_arrays_collections.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    
    
    private static int number;
    

    public static void main(String[] args) {
        List<Integer> NumList= new ArrayList<>();
        int index1;
        int index2;
        
        
        while (true) {
            Scanner scanner = new Scanner(System.in);
            

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
             
            if (number == -1){
            System.out.print("Start index ");
            index1 = scanner.nextInt();
            System.out.print("End index ");
            index2 = scanner.nextInt();

                break;
            } else{
                NumList.add(number);
            }

        }

        for (int i = index1; i <= index2 && i < NumList.size(); i++) {
            System.out.println(NumList.get(i));
        }
        
        System.out.println(NumList);
    }

    
}   