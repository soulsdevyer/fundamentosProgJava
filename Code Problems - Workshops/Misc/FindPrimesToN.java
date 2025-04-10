import java.util.Scanner;

/**
 * Clase que encuentra y muestra todos los números primos hasta un límite
 * especificado por el usuario.
 */
public class FindPrimesToN {

    /**
     * Método principal que solicita un límite y encuentra los números primos hasta
     * ese valor.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario el límite superior para encontrar números primos
        System.out.println("Enter the upper limit to find prime numbers:");
        int limit = scanner.nextInt();  // Lee el límite superior

        // Itera desde 2 hasta el límite para encontrar números primos
        for (int number = 2; number <= limit; number++) {
            // Verifica si el número actual es primo
            if (isPrime(number)) {
                System.out.println(number);  // Imprime el número primo
            }
        }

        // Cierra el scanner después de su uso para liberar recursos
        scanner.close();
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

        // Optimización: Solo verifica hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Si el número es divisible por cualquier número entre 2 y la raíz cuadrada de 'number'
            // significa que no es primo
            if (number % i == 0) {
                return false;
            }
        }

        // Si no se encontró ningún divisor, el número es primo
        return true;
    }
}
