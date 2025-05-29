import java.util.Scanner;

/**
 * Clase que determina si un producto está exento de IVA basado en su categoría
 * y precio.
 */
public class IVA {
    // Constantes para los límites de precios por categoría
    private static final double APPLIANCES_LIMIT = 3040320;
    private static final double GOODS_LIMIT = 3040320;
    private static final double SPORTS_LIMIT = 2904640;
    private static final double CLOTHING_LIMIT = 760080;
    private static final double TOYS_LIMIT = 380040;
    private static final double SCHOOL_SUPPLIES_LIMIT = 190020;

    /**
     * Método principal que procesa la entrada del usuario.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese la categoría del producto
        System.out.println("Enter product category:");
        String category = scanner.nextLine(); // Lee la categoría como una cadena de texto

        // Solicita al usuario que ingrese el precio del producto
        System.out.println("Enter product price:");
        float price = scanner.nextFloat(); // Lee el precio del producto

        // Llama al método calculateVAT para calcular si el producto está exento de IVA
        String result = calculateVAT(category, price);
        
        // Imprime el resultado
        System.out.println(result);

        // Cierra el scanner después de usarlo
        scanner.close();
    }

    /**
     * Determina si un producto está exento de IVA basado en su categoría y precio.
     * 
     * @param category Categoría del producto
     * @param price    Precio del producto
     * @return Mensaje indicando si el producto está exento de IVA
     */
    public static String calculateVAT(String category, float price) {
        // Muestra el precio ingresado
        System.out.println("Entered value: " + price);

        // Se evalúa la categoría del producto y se calcula si está exento de IVA
        switch (category) {
            case "Appliances":
            case "Goods":
                return evaluateExemption(price, APPLIANCES_LIMIT);
            case "Sports":
                return evaluateExemption(price, SPORTS_LIMIT);
            case "Clothing":
                return evaluateExemption(price, CLOTHING_LIMIT);
            case "Toys":
                return evaluateExemption(price, TOYS_LIMIT);
            case "SchoolSupplies":
                return evaluateExemption(price, SCHOOL_SUPPLIES_LIMIT);
            default:
                // Si la categoría no es válida, se retorna un mensaje indicando que se debe pagar IVA
                return "Invalid category. You must pay VAT for this product";
        }
    }

    /**
     * Evalúa si un precio está dentro del límite de exención.
     * 
     * @param price Precio del producto
     * @param limit Límite máximo para exención de IVA
     * @return Mensaje indicando si está exento o no
     */
    private static String evaluateExemption(float price, double limit) {
        // Si el precio es menor o igual al límite, el producto está exento de IVA
        return price <= limit ? "Your product is VAT exempt" : "You must pay VAT for this product";
    }
}
