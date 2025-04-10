/**
 * Ejemplo dedicado a demostrar la sobrecarga de métodos (Method Overloading) en
 * Java.
 * Este archivo no modifica las clases existentes, sino que extiende su uso con
 * ejemplos independientes.
 */
public class MethodOverloading {

    // Método principal para demostrar la sobrecarga
    public static void main(String[] args) {
        // Sobrecarga de constructores
        Person fullInfoPerson = new Person("Andrea", 25);
        Person nameOnlyPerson = new Person("Diego"); // Usa constructor sobrecargado

        fullInfoPerson.introduce(); // Usando método original
        nameOnlyPerson.introduce(); // Edad por defecto

        // Sobrecarga de método introduce(String)
        fullInfoPerson.introduce("Hello everyone, nice to meet you!");
        nameOnlyPerson.introduce("¡Saludos desde el mundo Java!");

        // Sobrecarga de método estático en UniversityUtils
        UniversityUtils.welcomeMessage(); // Original
        UniversityUtils.isAdult("Andrea", fullInfoPerson.getAge()); // Versión sobrecargada
        UniversityUtils.isAdult("Diego", nameOnlyPerson.getAge());
    }
}
