/**
 * Clase que representa una persona.
 * Este ejemplo muestra el uso de atributos, constructores y métodos simples.
 */
public class Person {
    // Atributos de instancia
    private String name;
    private int age;

    /**
     * Constructor: se ejecuta cuando se crea un nuevo objeto.
     * 
     * @param name Nombre de la persona
     * @param age  Edad de la persona
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método para mostrar la información de la persona
    public void introduce() {
        System.out.printf("Hi! My name is %s and I am %d years old.%n", name, age);
    }

    // Métodos getters (acceso)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Métodos setters (modificación)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
