package Misc;

import java.util.Scanner;

/**
 * Clase que valida las dimensiones del equipaje para determinar si puede ir en
 * cabina.
 */
public class Luggage {
    // Constants for luggage restrictions
    private static final double MAX_WEIGHT = 10.0; // kg
    private static final double MAX_HEIGHT = 35.0; // cm
    private static final double MAX_WIDTH = 25.0; // cm
    private static final double MAX_LENGTH = 55.0; // cm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter luggage weight (kg):");
        double weight = scanner.nextDouble();

        System.out.println("Enter luggage height (cm):");
        double height = scanner.nextDouble();

        System.out.println("Enter luggage width (cm):");
        double width = scanner.nextDouble();

        System.out.println("Enter luggage length (cm):");
        double length = scanner.nextDouble();

        String result = canBeCarried(weight, height, width, length);
        System.out.println(result);
        scanner.close();
    }

    /**
     * Validates if luggage dimensions meet cabin requirements.
     * 
     * @param weight Weight in kilograms
     * @param height Height in centimeters
     * @param width  Width in centimeters
     * @param length Length in centimeters
     * @return Message indicating if luggage can be carried in cabin or must go in
     *         hold
     */
    public static String canBeCarried(double weight, double height, double width, double length) {
        if (weight <= MAX_WEIGHT &&
                height <= MAX_HEIGHT &&
                width <= MAX_WIDTH &&
                length <= MAX_LENGTH) {
            return "Your luggage can go in the cabin";
        }
        return "Your luggage must go in the hold";
    }
}