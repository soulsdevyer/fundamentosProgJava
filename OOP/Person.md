# 👤 Clase `Person` en Java – Estructura y Explicación Didáctica

La clase `Person` es un ejemplo introductorio muy útil para comprender los **principios básicos de la Programación Orientada a Objetos (POO)** en Java, como:

- Declaración de atributos privados
- Uso de constructores
- Métodos públicos (`getters` y `setters`)
- Impresión de información con `System.out.printf`

---

## 🔹 Definición de la clase

```java
/**
 * Clase que representa una persona.
 * Este ejemplo muestra el uso de atributos, constructores y métodos simples.
 */
public class Person {
```

- Esta clase representa el concepto de una persona, con sus datos básicos: nombre y edad.
- Se define como `public`, lo que permite utilizarla desde cualquier otra clase del proyecto.

---

## 🔸 Atributos de instancia

```java
    private String name;
    private int age;
```

- Se definen dos atributos privados:
  - `name`: para almacenar el nombre de la persona.
  - `age`: para almacenar la edad.
- La palabra clave `private` aplica el **principio de encapsulamiento**, evitando el acceso directo a estos atributos desde fuera de la clase.

---

## 🔸 Constructor con parámetros

```java
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
```

- Este **constructor** se ejecuta al crear un nuevo objeto `Person`.
- Usa `this.name` y `this.age` para referirse a los atributos de la instancia actual.
- Permite **inicializar directamente** los valores de nombre y edad al crear el objeto.

---

## 🔸 Método público: `introduce()`

```java
    public void introduce() {
        System.out.printf("Hi! My name is %s and I am %d years old.%n", name, age);
    }
```

- Este método muestra por consola un mensaje con el nombre y edad de la persona.
- Utiliza `System.out.printf`, lo que permite **formatear el texto** con variables embebidas.
- Es un ejemplo claro de cómo una clase puede tener **comportamientos propios**.

---

## 🔸 Métodos `getters`: acceso a los atributos

```java
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
```

- Permiten obtener los valores actuales de los atributos privados.
- Se usan para respetar el encapsulamiento: los atributos no se exponen directamente.

---

## 🔸 Métodos `setters`: modificación de los atributos

```java
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

- Permiten **modificar** el valor de los atributos después de crear el objeto.
- También siguen las buenas prácticas de **controlar el acceso** a los datos internos.

---

## ✅ Resumen de conceptos aplicados

| Concepto           | Aplicación en la clase `Person`              |
| ------------------ | -------------------------------------------- |
| Clase y Objeto     | `Person` como plantilla para crear personas  |
| Atributos privados | `private String name`, `private int age`     |
| Encapsulamiento    | Uso de getters y setters para proteger datos |
| Constructor        | `Person(String name, int age)`               |
| Método público     | `introduce()` para imprimir información      |

---

Esta clase es una base excelente para extender hacia ejemplos de herencia (`Student`, `Teacher`) o para aprender conceptos como sobrecarga de métodos y polimorfismo.
