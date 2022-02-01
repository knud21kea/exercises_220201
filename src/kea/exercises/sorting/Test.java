package kea.exercises.sorting;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // Input 5 strings and sort them to reverse alphabetical order
        String[] words = new String[5];
        /* Test data
        words[0] = "abekat";
        words[1] = "musefælde";
        words[2] = "ananas";
        words[3] = "slut";
        words[4] = "solskin";*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please input 5 words ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". ");
            words[i] = input.nextLine();
        }

        sortWordsReverseAlphabet(words);
        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }
    }

    // Simple brute sort method
    private static void sortWordsReverseAlphabet(String[] words) {
        String swap;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (words[i].compareTo(words[j]) < 0) {
                    swap = words[i];
                    words[i] = words[j];
                    words[j] = swap;
                }
            }
        }
    }
}
