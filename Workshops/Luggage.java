import java.util.Scanner;
public class Luggage {
    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
       
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        
        
        String result = canBeCarried(weight, height, width, length);
        System.out.println(result);
        scanner.close();
        
    }
    
    
    public static String canBeCarried(double w, double h, double wid, double len){
        
        if (w <= 10 && h <= 35 && wid <= 25  && len <= 55 ){
            return "Su maleta puede ir en cabina";
        }
        
        return "Su maleta debe ir en bodega";
        
        
        
    }
}