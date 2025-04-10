import java.util.Scanner;

/**
 * Clase que calcula el promedio de números pares ingresados por el usuario.
 * El programa termina cuando se ingresa un número negativo.
 */
public class AverageEvenNumbers {

    /**
     * Método principal que ejecuta el programa.
     * Lee números desde la entrada estándar y calcula el promedio de los números
     * pares.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Se crea un objeto Scanner para la entrada del usuario.
        
        float average;  // Variable para almacenar el promedio de los números pares.
        float sum = 0;  // Variable para almacenar la suma de los números pares.
        float evenCount = 0;  // Variable para contar cuántos números pares se han ingresado.

        // Se solicita al usuario que ingrese números.
        System.out.println("Enter numbers (negative number to finish):");
        float number = scanner.nextFloat();  // Lee el primer número ingresado.

        // Bucle que continúa hasta que el número ingresado sea negativo.
        while (number >= 0) {
            // Si el número no es par, se ignora y se pide el siguiente número.
            if (number % 2 != 0) {
                number = scanner.nextFloat();  // Lee el siguiente número.
                continue;  // Pasa a la siguiente iteración del bucle.
            }

            // Si el número es par, se suma a la variable sum y se incrementa el contador evenCount.
            evenCount++;
            sum += number;
            
            number = scanner.nextFloat();  // Lee el siguiente número.
        }

        // Si se han ingresado números pares, se calcula y muestra el promedio.
        if (evenCount > 0) {
            average = sum / evenCount;  // Calcula el promedio de los números pares.
            System.out.println("The average of even numbers is: " + average);
        } else {
            // Si no se han ingresado números pares, se informa al usuario.
            System.out.println("No positive even numbers were entered.");
        }

        scanner.close();  // Cierra el scanner para liberar los recursos.
    }
}
