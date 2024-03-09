package _3_arrays_collections.exercise10;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
        
    public void add(String word, String translation){
        // Check if the word already exists in the dictionary
        if (dictionary.containsKey(word)) {
            // If it does, add the translation to the existing list
            ArrayList<String> translations = dictionary.get(word);// get the array list as the value
            translations.add(translation);
        } else {
            // If it doesn't, create a new list with the translation
            ArrayList<String> translations = new ArrayList<>();//creating the new array list to holde values
            translations.add(translation);
            dictionary.put(word, translations);
        }
    }

    public ArrayList<String> translate(String word){
        // Check if the word exists in the dictionary
        if (dictionary.containsKey(word)) {
            // If it does, return the list of translations
            return dictionary.get(word);
        } else {
            // If it doesn't, return an empty list
            return new ArrayList<>();
        }
    }

    public void remove(String word){
        // Remove the word from the dictionary
        dictionary.remove(word);
    }
}

