
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

  
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> AgeList = new ArrayList<>();
    
            while (true) {
                System.out.print("Enter a line: ");
                String line = scanner.nextLine();
                
                


                if (line.isEmpty()) {
                    break;
                }

                String trimmedLine = line.trim();
                String[] Array = trimmedLine.split(",");
                int num = Integer.parseInt(Array[1]);
                
                AgeList.add(num);



                

    
            }
            
            Collections.sort(AgeList, Collections.reverseOrder());

            
            System.out.println(AgeList.get(0));
        }
        
    }
