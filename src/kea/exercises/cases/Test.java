package kea.exercises.cases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Input a sentence and output with words converted upper/lower case

        Scanner input = new Scanner(System.in);
        ArrayList<String> wordList;

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        //String sentence = "To be or NOT to be that is tHE question"; //test data
        wordList = splitInputToArrayList(sentence);
        for (String word : wordList) {
            System.out.print(convertWord(word) + " ");
        }
    }

    private static ArrayList<String> splitInputToArrayList(String sentence) {
        return new ArrayList<>(Arrays.asList(sentence.split(" ")));
    }

    private static String convertWord(String word) {
        String convertedWord;
        if (Objects.equals(word, word.toUpperCase())) {
            convertedWord = word; // word is all upper case so no change
        } else {
            convertedWord = word.toLowerCase(); // all other words to lower case
            if (word.length() > 3) {
                convertedWord = word.substring(0, 1).toUpperCase() + word.substring(1); // 1st letter upper case
            }
        }
        return convertedWord;
    }
}
