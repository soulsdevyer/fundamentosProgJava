/**
 * La clase Student hereda de Person usando "extends".
 * Añade nuevos atributos y reutiliza la lógica de la clase padre.
 */
public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age); // Llama al constructor de la clase base (Person)
        this.major = major;
    }

    public void study() {
        System.out.printf("%s is studying %s.%n", getName(), major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
