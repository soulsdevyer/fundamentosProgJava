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
        int limit = 50;  // Límite de términos en la secuencia de Fibonacci a generar.
        System.out.println("Generating Fibonacci sequence up to term " + limit + ":");
        fibonacci(limit);  // Llama al método fibonacci con el límite especificado.
    }

    /**
     * Genera y muestra la secuencia de Fibonacci.
     * Detecta desbordamiento cuando los números se vuelven negativos.
     * 
     * @param limit Número de términos a generar
     */
    static void fibonacci(int limit) {
        int previousNumber = 0;  // Primer número de la secuencia (F(0)).
        int currentNumber = 1;   // Segundo número de la secuencia (F(1)).

        // Genera la secuencia hasta el número de términos especificado por 'limit'.
        for (int i = 0; i < limit; i++) {
            System.out.print(previousNumber + " ");  // Muestra el número actual de la secuencia.

            // Calcula el siguiente número en la secuencia de Fibonacci.
            int next = currentNumber + previousNumber;
            previousNumber = currentNumber;  // Actualiza previousNumber al valor de currentNumber.
            currentNumber = next;  // Actualiza currentNumber al siguiente número de la secuencia.

            // Detecta desbordamiento. Si el número anterior se vuelve negativo, muestra el mensaje de error.
            if (previousNumber < 0) {
                System.out.println("\nOverflow detected! Negative number found: " + previousNumber);
                break;  // Sale del bucle si se detecta un desbordamiento.
            }
        }
    }
}
