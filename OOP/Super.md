# 🔑 Uso de `super` en Java – Guía Didáctica

En Java, la palabra clave `super` es una herramienta fundamental en la Programación Orientada a Objetos (POO).  
Se utiliza para **hacer referencia explícita a elementos (atributos, métodos o constructores) de la clase padre o superclase** desde una subclase.

Es especialmente útil en contextos de **herencia**, cuando una subclase necesita reutilizar o extender el comportamiento definido en su clase base.

---

## 📚 ¿Qué puedes hacer con `super`?

| Uso de `super`   | ¿Para qué sirve?                                     |
| ---------------- | ---------------------------------------------------- |
| `super()`        | Llamar al constructor de la clase padre.             |
| `super.metodo()` | Llamar a un método heredado que ha sido sobrescrito. |
| `super.atributo` | Acceder directamente a un atributo de la superclase. |

---

## 🧱 1. Llamar al constructor padre: `super(...)`

Cuando una subclase necesita **inicializar atributos que pertenecen a la superclase**, puede hacerlo utilizando `super(...)` como primera línea dentro de su propio constructor.

```java
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Student extends Person {
    String major;

    public Student(String name, String major) {
        super(name); // Llama al constructor de Person
        this.major = major;
    }
}

public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Cuando una subclase sobrescribe un método de la superclase, aún puede acceder a la versión original usando super.
public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound(); // Llama a la versión de Animal
        System.out.println("Woof! Woof!");
    }
}

// Aunque no es una práctica común, es posible acceder directamente a atributos de la clase padre si están declarados como protected o public.
public class Vehicle {
    protected String brand = "Generic";
}

public class Car extends Vehicle {
    public void printBrand() {
        System.out.println("Brand: " + super.brand);
    }
}


```
