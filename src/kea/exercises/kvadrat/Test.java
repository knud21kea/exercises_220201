package kea.exercises.kvadrat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Input an integer i and then draw a square with ixi "*"

        System.out.println("""
                Program draws a square with *s
                Please input an integer between 1 and 20.\040""");
        int side = getValidInt();
        drawSquare(side);

        // Also with custom symbol
        System.out.println("""
                Or choose your own character!
                Please input a character (accepts only the first character entered.\040""");
        char symbol = getValidChar();
        drawSquare(side, symbol);
    }

    // Returns a double, catches type mismatch
    private static int getValidInt() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a whole number");
                input.nextLine();
            }
        }
    }

    // Returns first character from input string
    private static char getValidChar() {
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
    }

    public static void drawSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // overload method to print with user defined character
    public static void drawSquare(int side, char symbol) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
