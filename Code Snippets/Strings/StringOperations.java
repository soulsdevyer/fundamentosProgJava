import java.util.Scanner;

/**
 * Clase que implementa diversos métodos de manejo de cadenas de texto (strings).
 * Proporciona funcionalidades como calcular la longitud, encontrar el índice de un 
 * carácter, obtener subcadenas, comparar cadenas y más.
 */
public class StringOperations {

    /**
     * Método principal que demuestra el uso de los métodos de manejo de strings.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese una cadena de texto
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Muestra los resultados de los métodos de manejo de strings
        System.out.println("Length of the string: " + length(inputString));
        System.out.println("Index of first 'a' in the string: " + indexOf(inputString, 'a'));
        System.out.println("Substring from index 2 to 5: " + substring(inputString, 2, 5));
        System.out.println("Does the string equal 'Hello'? " + equals(inputString, "Hello"));
        System.out.println("Does the string equal 'hello' (ignore case)? " + equalsIgnoreCase(inputString, "hello"));
        System.out.println("Character at index 3: " + charAt(inputString, 3));
        System.out.println("String representation: " + toString(inputString));
        System.out.println("Compare 'Hello' with input string: " + compareTo(inputString, "Hello"));

        scanner.close(); // Cierra el scanner
    }

    /**
     * Calcula la longitud de la cadena.
     * 
     * @param str Cadena de texto
     * @return Longitud de la cadena
     */
    public static int length(String str) {
        return str.length();
    }

    /**
     * Encuentra el índice de la primera ocurrencia de un carácter en la cadena.
     * 
     * @param str Cadena de texto
     * @param ch  Carácter a buscar
     * @return Índice de la primera ocurrencia del carácter, o -1 si no se encuentra
     */
    public static int indexOf(String str, char ch) {
        return str.indexOf(ch);
    }

    /**
     * Obtiene una subcadena de la cadena original, desde un índice de inicio hasta
     * un índice de fin (exclusivo).
     * 
     * @param str   Cadena de texto
     * @param start Índice de inicio
     * @param end   Índice de fin (exclusivo)
     * @return Subcadena entre los índices proporcionados
     */
    public static String substring(String str, int start, int end) {
        return str.substring(start, end);
    }

    /**
     * Compara si la cadena proporcionada es igual a otra cadena.
     * 
     * @param str1 Primera cadena
     * @param str2 Segunda cadena
     * @return true si las cadenas son iguales, false en caso contrario
     */
    public static boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    /**
     * Compara si la cadena proporcionada es igual a otra cadena, ignorando las
     * diferencias de mayúsculas y minúsculas.
     * 
     * @param str1 Primera cadena
     * @param str2 Segunda cadena
     * @return true si las cadenas son iguales, ignorando mayúsculas y minúsculas
     */
    public static boolean equalsIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    /**
     * Obtiene el carácter en un índice específico de la cadena.
     * 
     * @param str   Cadena de texto
     * @param index Índice en la cadena
     * @return Carácter en el índice proporcionado
     */
    public static char charAt(String str, int index) {
        return str.charAt(index);
    }

    /**
     * Retorna la representación en cadena de un objeto.
     * 
     * @param obj Objeto a convertir a cadena
     * @return Representación en cadena del objeto
     */
    public static String toString(String obj) {
        return obj.toString();
    }

    /**
     * Compara dos cadenas lexicográficamente.
     * 
     * @param str1 Primera cadena
     * @param str2 Segunda cadena
     * @return Un valor negativo si str1 es menor que str2, cero si son iguales,
     *         o un valor positivo si str1 es mayor que str2.
     */
    public static int compareTo(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
