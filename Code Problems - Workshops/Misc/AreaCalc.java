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
        Scanner scanner = new Scanner(System.in);  // Se crea un objeto Scanner para la entrada del usuario.
        
        // Solicita al usuario la cantidad de casas para calcular el área total.
        System.out.println("Enter the number of houses to calculate:");

        int numberOfHouses = scanner.nextInt();  // El número de casas que el usuario desea calcular.
        double totalArea = 0;  // Inicializa la variable totalArea para acumular el área de todas las casas.

        // Itera por cada casa para calcular su área.
        for (int i = 1; i <= numberOfHouses; i++) {
            System.out.println("\nHouse " + i + ":");
            System.out.println("Enter the height of the house (meters):");
            double height = scanner.nextDouble();  // Solicita la altura de la casa en metros.
            System.out.println("Enter the width of the house (meters):");
            double width = scanner.nextDouble();  // Solicita el ancho de la casa en metros.

            double area = calculateArea(height, width);  // Calcula el área de la casa utilizando el método calculateArea.
            totalArea += area;  // Suma el área calculada a la variable totalArea.

            // Muestra el área de la casa actual.
            System.out.println("Area of house " + i + ": " + area + " square meters");
        }

        // Muestra la suma total de las áreas de todas las casas.
        System.out.println("\nThe total sum of areas is: " + totalArea + " square meters");

        scanner.close();  // Cierra el scanner para liberar los recursos.
    }

    /**
     * Calcula el área de una casa rectangular.
     * 
     * @param height Alto de la casa en metros
     * @param width  Ancho de la casa en metros
     * @return Área total en metros cuadrados
     */
    public static double calculateArea(double height, double width) {
        return height * width;  // Calcula el área multiplicando el alto por el ancho.
    }
}
