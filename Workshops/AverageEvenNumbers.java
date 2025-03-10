import java.util.Scanner;
public class AverageEvenNumbers{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float average;
        float total = 0;
        float numElements = 0;
        
        float number = scanner.nextFloat();
        
        while(number >= 0){
            if (number % 2 != 0){
                number = scanner.nextFloat();
                continue;
            }
            
            numElements++;
            total += number;
            number = scanner.nextFloat();
        }
        
        
        if (numElements > 0){
            average = total / numElements;
            System.out.println(average);
            
        }
        scanner.close();
        
    }
}