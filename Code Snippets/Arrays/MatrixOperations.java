import java.util.Random;
import java.util.Arrays;

/**
 * Clase que implementa operaciones de generación y visualización de matrices.
 * Demuestra diferentes maneras de llenar y mostrar arreglos bidimensionales (matrices).
 */
public class MatrixOperations {

    public static void main(String[] args) {
        // Definir las dimensiones de la matriz
        int rows = 3, cols = 3;

        // Generar y mostrar matrices usando diferentes métodos
        System.out.println("Matriz generada por columnas:");
        int[][] columnMatrix = generateNewMatrixByCols(rows, cols);
        displayMatrix(columnMatrix);

        System.out.println("\nMatriz generada por filas:");
        int[][] rowMatrix = generateNewMatrixByRows(rows, cols);
        displayMatrix(rowMatrix);
    }

    /**
     * Genera una matriz llenándola por filas.
     * 
     * @param rows Número de filas
     * @param cols Número de columnas
     * @return Matriz generada
     */
    public static int[][] generateNewMatrixByRows(int rows, int cols) {
        int[][] newMatrix = new int[rows][cols];
        Random rand = new Random();

        // Llenamos la matriz recorriéndola fila por fila
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Asignamos un valor aleatorio a cada elemento
                newMatrix[i][j] = rand.nextInt(15);
            }
        }
        return newMatrix;
    }

    /**
     * Genera una matriz llenándola por columnas.
     * 
     * @param rows Número de filas
     * @param cols Número de columnas
     * @return Matriz generada
     */
    public static int[][] generateNewMatrixByCols(int rows, int cols) {
        int[][] newMatrix = new int[rows][cols];
        Random rand = new Random();

        // Llenamos la matriz recorriéndola columna por columna
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                // Asignamos un valor aleatorio a cada elemento
                newMatrix[i][j] = rand.nextInt(15);
            }
        }
        return newMatrix;
    }

    /**
     * Muestra una matriz de manera formateada en la consola.
     * 
     * @param matrix Matriz a mostrar
     */
    public static void displayMatrix(int[][] matrix) {
        // Recorremos cada fila de la matriz
        for (int[] row : matrix) {
            // Recorremos cada elemento de la fila
            for (int element : row) {
                // Imprimimos cada elemento con un formato de ancho de 3 caracteres
                System.out.printf("%3d ", element);
            }
            // Salto de línea después de cada fila
            System.out.println();
        }

        // Otra forma de hacerlo usando bucles tradicionales:
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
