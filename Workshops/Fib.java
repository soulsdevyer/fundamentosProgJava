public class Fib {
    public static void main(String args[])
    {
       
        int N = 50;

        
        fibonacci(N);
    }
    
static void fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            
            System.out.print(num1 + " ");

            // Aux variable for swapping values
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            
            if (num1 < 0){
                System.out.println("A negative return has been found: " + num1);
                
            }
        }
    }

    
    
    
}
