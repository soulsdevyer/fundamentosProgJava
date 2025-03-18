import java.util.Scanner;
import java.util.Arrays;

public class MatrixHM{


    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the dimension of the matrix");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        mainMenu();
    }


    public static void mainMenu(){
        System.out.println("Select the option you wish to use:");
        int option = scanner.nextInt();

        switch(option){
            case 1:
                generateNewMatrixByInput(rows, cols);
                break;
            
            case 2:
                generateNewMatrixByRandom(rows, cols);
                break;

            case 3:
                displayMatrix(matrix);
                break;
            
            case 4:
                matrixRowSums(matrix);
                break;
            
            case 5: 
                matrixColSums(matrix);
                break;

            case 6: 
                displayDiagonal(matrix);
                break;
            
            case 7:

        }

        

    }

    public static int[][] generateNewMatrixByRandom(int rows, int cols) {
        int[][] newMatrix = new int[rows][cols];
        Random rand = new Random();
        // Fill matrix by rows:

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
         
                newMatrix[i][j] = rand.nextInt(31) - 10; // -10 to 10
            }
        }
        return newMatrix;

    }

    public static int[][] generateNewMatrixByInput(int rows, int cols) {
        int[][] newMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
         
                newMatrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return newMatrix;

    }

    public static void displayMatrix(int[][] matrix){
        for(i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    public static int matrixRowSums(int[][] matrix){
        System.out.println("Insert the row number you wish to sum");
        int rowNumber = scanner.nextInt();
        int total = 0;
        for (i = 0; i < matrix[rowNumber]; i++){
            total += matrix[i];
        }
        scanner.close();
        return total;

    }

    public static int matrixColSums(int[][] matrix){
        System.out.println("Insert the col number you wish to sum");
        int colNumber = scanner.nextInt();
        int total = 0;
        for (i = 0; i < matrix[colNumber]; i++){
            total += matrix[i];
        }
        scanner.close();
        return total;

    }
    /*
    public static void displayDiagonal(int[][] matrix){
        System.out.println(matrix[0][0]);
        for(i = 0; i < matrix.length; i++){
            for(j = 0; j < matrix.length[i]; j++){
                System.out.println();
            }

        }
    }
    */

   public static int matrixTotalSum(int[][] matrix){
    int total = 0;
    for(i = 0; i < matrix.length; i++){
        for(j = 0; j < matrix.length[i]; j++){
            total += matrix[i][j];
        }
    }
    return total;
   }

   public static int matrixSumAverage(int[][] matrix){
    int total = 0;
    for(i = 0; i < matrix.length; i++){
        for(j = 0; j < matrix.length[i]; j++){
            total += matrix[i][j];
        }
    }

    return total / matrix.length;
   }

   public static int matrixMaxValue(int[][] matrix){
    maxValue = matrix[0][0];
    for(i = 0; i < matrix.length; i++){
        for(j = 0; j < matrix.length[i]; j++){
            int currentValue = matrix.length[i][j];
            if (currentValue > maxValue){
                maxValue = currentValue;
            }
        }
    }
    return maxValue;

   }

   public static int matrixMinValue(int[][] matrix){
    minValue = matrix[0][0];
    for(i = 0; i < matrix.length; i++){
        for(j = 0; j < matrix.length[i]; j++){
            int currentValue = matrix.length[i][j];
            if (currentValue < minValue){
                minValue = currentValue;
            }
        }
    }
    return minValue;

   }
    }
    }
    
}