package _3_arrays_collections.exercise5;

import java.util.ArrayList;
import java.util.Collections;
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
            
                break;
            } else{
                NumList.add(number);
            }

        }
        Collections.sort(NumList, Collections.reverseOrder());

        
        
        System.out.println("Larget number:" + NumList.get(0));
    }

    
}   