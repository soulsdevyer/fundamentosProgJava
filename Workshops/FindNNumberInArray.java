import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exec = true;
        int[] arrayNumbers = { 5, 13, 11, 31, 12, 17, 2, 139, 40, 99, 2, 1830, 3, 42, 1, 4 };

        while (exec == true) {
            System.out.println("Digite el número que desea buscar en el arreglo: ");
            int x = scanner.nextInt();

            int resultado = BuscarNumero(arrayNumbers, x);

            if (resultado != -1) {
                System.out.println("El número " + x + " se encuentra en la posición: " + resultado);
            } else {
                System.out.println("El número " + x + " no se encuentra en el arreglo.");
            }
            System.out.println("Escriba 1 si quiere seguir buscando, ó escriba otro número para parar");
            int opcion = scanner.nextInt();
            if (opcion != 1) {
                exec = false;
            }

        }

    }

    public static int BuscarNumero(int[] arrayNumbers, int x) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == x) {

                return i;
            }
        }
        return -1;
    }

}