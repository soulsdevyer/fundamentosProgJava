package Misc;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product category:");
        String category = scanner.nextLine();

        System.out.println("Enter product price:");
        float price = scanner.nextFloat();

        String result = calculateVAT(category, price);
        System.out.println(result);
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
        System.out.println("Entered value: " + price);

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
        return price <= limit ? "Your product is VAT exempt" : "You must pay VAT for this product";
    }
}