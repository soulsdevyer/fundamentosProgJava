package Misc;

import java.util.Scanner;

/**
 * Clase que calcula y suma las áreas de múltiples casas.
 * Permite al usuario ingresar dimensiones de varias casas y obtiene el área
 * total.
 */
public class AreaCalc {
    /**
     * Método principal que ejecuta el programa.
     * Maneja la interacción con el usuario y realiza los cálculos de área.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of houses to calculate:");

        int numberOfHouses = scanner.nextInt();
        double totalArea = 0;

        // Itera por cada casa para calcular su área
        for (int i = 1; i <= numberOfHouses; i++) {
            System.out.println("\nHouse " + i + ":");
            System.out.println("Enter the height of the house (meters):");
            double height = scanner.nextDouble();
            System.out.println("Enter the width of the house (meters):");
            double width = scanner.nextDouble();

            double area = calculateArea(height, width);
            totalArea += area;

            System.out.println("Area of house " + i + ": " + area + " square meters");
        }

        System.out.println("\nThe total sum of areas is: " + totalArea + " square meters");
        scanner.close();
    }

    /**
     * Calcula el área de una casa rectangular.
     * 
     * @param height Alto de la casa en metros
     * @param width  Ancho de la casa en metros
     * @return Área total en metros cuadrados
     */
    public static double calculateArea(double height, double width) {
        return height * width;
    }
}