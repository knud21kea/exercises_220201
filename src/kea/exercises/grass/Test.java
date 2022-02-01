package kea.exercises.grass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    private final static double GROWTH = 0.8; // constant

    public static void main(String[] args) {

        // User inputs current length
        System.out.print("How long is the grass now in cm? ");
        double lengthOfGrass = getValidDouble();

        // User inputs max length
        System.out.print("How long can the grass be in cm? ");
        double maxLengthOfGrass = getValidDouble();

        // Outputs days until length >= max length
        double daysToCut = howManydaysUntilCut(lengthOfGrass, maxLengthOfGrass);
        System.out.println("The grass will need cutting in " + daysToCut + " days.");
    }

    // Returns decimal days until grass is at max length
    public static double howManydaysUntilCut(double lengthNow, double lengthMax) {
        return (lengthMax - lengthNow) / GROWTH;
    }

    // Returns a double, catches type mismatch
    private static double getValidDouble() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a decimal number");
                input.nextLine();
            }
        }
    }
}
