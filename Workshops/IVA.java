import java.util.Scanner;
public class IVA {
    
    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        
        String product = scanner.nextLine();
        float price = scanner.nextFloat();
        
        String isApplied = applyIVA(product, price);
        System.out.println(isApplied);
        scanner.close();
    }
    
    public static String applyIVA(String product, float price){
        
        System.out.println("Valor ingresado: " + price);
        
        if (product.equals("Electrodomésticos") && price <= 3040320){
            return "Tu producto está exento de IVA";
        }
        
        else if (product.equals("Bienes") && price <= 3040320){
            return "Tu producto está exento de IVA";
        }
        
        else if (product.equals("Deportes") && price <= 2904640){
            return "Tu producto está exento de IVA";
        }
        
        else if (product.equals("Vestuario") && price <= 760080){
            return "Tu producto está exento de IVA";
        }
        
        else if (product.equals("Juguetes") && price <= 380040){
            return "Tu producto está exento de IVA";
        }
        
        else if (product.equals("Escolares") && price <= 190020){
            return "Tu producto está exento de IVA";
        }
        
        else {
            return "Debes pagar el IVA en tu producto";
        }
        
    }
}