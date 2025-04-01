package Misc;

/**
 * Clase que genera la secuencia de Fibonacci hasta un límite especificado.
 * Incluye detección de desbordamiento para números negativos.
 */
public class Fib {
    /**
     * Método principal que inicia la generación de la secuencia.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        int limit = 50;
        System.out.println("Generating Fibonacci sequence up to term " + limit + ":");
        fibonacci(limit);
    }

    /**
     * Genera y muestra la secuencia de Fibonacci.
     * Detecta desbordamiento cuando los números se vuelven negativos.
     * 
     * @param limit Número de términos a generar
     */
    static void fibonacci(int limit) {
        int previousNumber = 0;
        int currentNumber = 1;

        for (int i = 0; i < limit; i++) {
            System.out.print(previousNumber + " ");

            // Variable auxiliar para intercambiar valores
            int next = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = next;

            // Detectar desbordamiento
            if (previousNumber < 0) {
                System.out.println("\nOverflow detected! Negative number found: " + previousNumber);
                break;
            }
        }
    }
}