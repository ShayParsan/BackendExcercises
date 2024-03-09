package _3_arrays_collections.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a line: ");
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            String trimmedLine = line.trim();

            List<String> wordsList = new ArrayList<>();

            String[] wordsArray = trimmedLine.split("\\s+");
            
            for (int i = 0; i < wordsArray.length; i++) {
                wordsList.add(wordsArray[i]);
            }

            if (!wordsList.isEmpty()) {
                String lastWord = wordsList.get(wordsList.size() - 1);
                System.out.println("Last word: " + lastWord);
            }
        }

        scanner.close();
    }
}









