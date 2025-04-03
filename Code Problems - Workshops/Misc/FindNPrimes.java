import java.util.Scanner;

/**
 * Clase que encuentra y muestra los primeros N números primos.
 * Implementa dos métodos de verificación de primalidad.
 */
public class FindNPrimes {

    /**
     * Método principal que solicita la cantidad de números primos a encontrar.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Enter the number of prime numbers to find:");
        int limit = scanner.nextInt();  // Lee la cantidad de números primos a encontrar
        int count = 0;  // Contador de números primos encontrados

        // Bucle que encuentra números primos hasta alcanzar el límite especificado
        for (int number = 2; count < limit; number++) {
            // Verifica si el número es primo
            if (isPrime(number)) {
                System.out.println(number);  // Imprime el número primo
                count++;  // Incrementa el contador de números primos
            }
        }

        scanner.close();  // Cierra el Scanner para liberar recursos
    }

    /**
     * Verifica si un número es primo.
     * Un número primo es aquel que solo es divisible por 1 y por sí mismo.
     * 
     * @param number Número a verificar
     * @return true si el número es primo, false en caso contrario
     */
    public static boolean isPrime(int number) {
        // Si el número es menor o igual a 1, no es primo
        if (number <= 1) {
            return false;
        }

        // Versión optimizada usando la raíz cuadrada
        // Solo verificamos divisores hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // Si el número es divisible por i, no es primo
                return false;
            }
        }

        return true;  // Si no se encontró ningún divisor, el número es primo
    }
}
