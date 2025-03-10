// El archivo Main se actualiza constantemente según el ejercicio que se requiera ejecutar
import java.util.Scanner;
public class FindPrimesToN{
    
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        
        
        for(int number = 2; number <= limit; number++){
            if (isPrime(number)) {
                System.out.println(number);
                scanner.close();
            }
        }
       
        
    }
    
    public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;  
    }
    
   
    for (int i = 2; i < Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;  
        }
    }
    
    return true;  
}

}