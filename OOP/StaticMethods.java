
public class StaticMethods {

}

/**
 * Clase con métodos estáticos que no requieren crear un objeto para ser usados.
 * Este tipo de métodos es útil para utilidades o funciones generales.
 */
public class UniversityUtils {

    /**
     * Calcula si una edad representa a una persona mayor de edad.
     * 
     * @param age Edad a evaluar
     * @return true si es mayor de edad, false en caso contrario
     */
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    /**
     * Imprime un saludo genérico.
     */
    public static void welcomeMessage() {
        System.out.println("Welcome to the Java POO workshop!");
    }
}
