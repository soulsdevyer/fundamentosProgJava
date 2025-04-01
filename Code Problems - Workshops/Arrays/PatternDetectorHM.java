package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class PatternDetectorHM {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int[] result = detectPattern(numbers);
        System.out.println("Arreglo original: " + Arrays.toString(numbers));

        System.out.println("\nArreglo nuevo: " + Arrays.toString(result));

    }

    public static int[] detectPattern(int[] array) {
        int[] newArray = new int[(array.length - 1) * 2];
        int newIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            newArray[newIndex++] = array[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
            newArray[newIndex++] = array[i];
        }

        while (newIndex < newArray.length) {
            newArray[newIndex++] = 0;
        }

        return newArray;
    }
}