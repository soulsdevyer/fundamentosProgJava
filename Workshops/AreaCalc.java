import java.util.Scanner;

public class AreaCalc {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa de cálculo y sumatora de áreas.");
        System.out.println("Ingresa para cuántas casas deseas hacer el cálculo:");
        
        int houseNumbers = scanner.nextInt();
        
        double sumOfAreas = 0;
        
        for(int i = 0; i <= houseNumbers;){
            
            System.out.println("Ingresa el alto de la casa");
            double height = scanner.nextDouble();
            System.out.println("Ingresa el ancho de la casa");
            double width = scanner.nextDouble();
            
            double area = CalculateArea(height, width);
            sumOfAreas += area;
        }
    
        System.out.println("La sumatoria de las áreas proporcionadas es: " + sumOfAreas);
        scanner.close();
        
    }
    
     public static double CalculateArea(double height, double width){
        return height * width;
    }
}