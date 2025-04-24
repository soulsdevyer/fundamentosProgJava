# 🧬 Herencia en Java – Explicación y Ejemplo Didáctico

La **herencia** es uno de los pilares fundamentales de la Programación Orientada a Objetos. Permite que una clase (llamada **subclase**) herede atributos y métodos de otra clase (llamada **superclase**), favoreciendo la reutilización del código y la jerarquía lógica entre conceptos.

---

## 🔹 ¿Por qué usar herencia?

Cuando tienes clases que comparten comportamientos similares, puedes mover esos comportamientos a una **clase padre** común y hacer que las demás los **hereden**, en lugar de repetir código.

---

## 🔸 Estructura básica de herencia

```java
// Clase padre (superclase)
// Clase padre (superclase)
public class Animal {

    // Atributo de instancia común a todos los animales: su nombre.
    // No se declara como 'private' para simplificar el acceso desde las subclases,
    // pero en buenas prácticas reales, se usarían 'getters' y 'setters'.
    String name;

    // Método común a todos los animales.
    // En este caso, imprime un mensaje genérico de que el animal hace un sonido.
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }

    // Otro método común que simula la acción de comer.
    // Utiliza el atributo 'name' para personalizar el mensaje.
    public void eat() {
        System.out.println(name + " is eating.");
    }
}


// Clase hija (subclase) que extiende de Animal
public class Dog extends Animal {

    // Método específico que solo tienen los perros, no está en la clase Animal.
    // Esto demuestra cómo una subclase puede tener su propia funcionalidad única.
    public void wagTail() {
        // Accede al atributo heredado 'name' desde la superclase.
        System.out.println(name + " is wagging its tail.");
    }

    // Sobrescritura (Override) del método makeSound de la clase Animal.
    // Esto reemplaza el comportamiento genérico con uno específico para perros.
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}


// Otra subclase de Animal
public class Cat extends Animal {

    // Método exclusivo de la clase Cat: acción de ronronear
    public void purr() {
        System.out.println(name + " is purring.");
    }

    // También sobrescribimos el método makeSound con el sonido típico de un gato.
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}


// Clase principal para ejecutar el programa y demostrar herencia
public class InheritanceDemo {
    public static void main(String[] args) {

        // Creamos un objeto de tipo Dog (perro)
        Dog myDog = new Dog();
        myDog.name = "Bobby";         // Accedemos directamente al atributo heredado
        myDog.eat();                  // Método heredado de Animal
        myDog.makeSound();            // Método sobrescrito en Dog
        myDog.wagTail();              // Método específico de Dog

        // Creamos un objeto de tipo Cat (gato)
        Cat myCat = new Cat();
        myCat.name = "Luna";          // También accedemos directamente al atributo heredado
        myCat.eat();                  // Método heredado de Animal
        myCat.makeSound();            // Método sobrescrito en Cat
        myCat.purr();                 // Método exclusivo de Cat
    }
}


```

## 🧰 Aplicaciones útiles de la herencia

### 1. 🔄 Evitar duplicación de código

Cuando varias clases comparten atributos o métodos comunes, esos elementos pueden colocarse en una **superclase** para que las demás los hereden.

**Ejemplo clásico:**  
Las clases `Estudiante`, `Profesor` y `Administrativo` pueden heredar de una clase base `Persona`.

Esto evita repetir el mismo código en múltiples lugares.

---

### 2. 🧩 Modelado jerárquico

La herencia te ayuda a reflejar relaciones **"es-un" (is-a)**, lo cual mejora la claridad y organización del programa.

- Un `Cuadrado` **es una** `Figura`.
- Un `Administrador` **es un** `Usuario`.
- Un `Vehículo` puede ser un `Auto`, una `Moto`, o una `Bicicleta`.

Esta forma de pensar permite crear estructuras lógicas más naturales y mantenibles.

---

### 3. ♻️ Polimorfismo

La herencia permite que los objetos puedan ser tratados como si fueran de su **clase padre**, habilitando el uso de **polimorfismo**.

Esto es especialmente útil en estructuras como listas, controladores, o colecciones de objetos:

```java
List<Animal> animales = new ArrayList<>();
animales.add(new Gato());
animales.add(new Perro());
```

## 🧠 Consideraciones importantes

### ➕ Sobrescritura (`@Override`)

Puedes modificar el comportamiento de un método heredado usando la anotación `@Override`.  
Esto permite **personalizar acciones específicas en cada subclase** sin alterar la lógica de la superclase.

```java
@Override
public void makeSound() {
    System.out.println("Miau");
}

```
