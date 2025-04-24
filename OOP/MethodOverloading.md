# ➕ Sobrecarga de Métodos en Java – Ejemplo Didáctico

En este ejemplo aprenderás cómo funciona la **sobrecarga de métodos (method overloading)** en Java.  
La sobrecarga permite **usar el mismo nombre de método** varias veces dentro de una clase, siempre y cuando **tengan parámetros distintos**. También se puede aplicar a **constructores**.

Este ejemplo usa las clases `Person` y `UniversityUtils`, previamente definidas en el proyecto, y demuestra cómo aprovechar la sobrecarga sin modificar esas clases.

---

## 🧪 Clase `MethodOverloading`

Esta clase se utiliza como un archivo de prueba para demostrar **distintas formas de llamar métodos y constructores sobrecargados**.

```java
/**
 * Ejemplo dedicado a demostrar la sobrecarga de métodos (Method Overloading) en
 * Java.
 * Este archivo no modifica las clases existentes, sino que extiende su uso con
 * ejemplos independientes.
 */
public class MethodOverloading {
```

- Este bloque de comentarios aclara el objetivo del archivo: practicar **sin alterar las clases base**.
- El propósito es **demostrar el concepto de sobrecarga en un entorno controlado**.

---

### 🔹 Método `main`: punto de entrada

```java
    public static void main(String[] args) {
```

- Aquí comienza el método principal desde donde se ejecutan todas las pruebas.
- Dentro de este método se utilizarán **constructores y métodos sobrecargados**.

---

### 🔸 Sobrecarga de Constructores en `Person`

```java
        Person fullInfoPerson = new Person("Andrea", 25);
        Person nameOnlyPerson = new Person("Diego"); // Usa constructor sobrecargado
```

- Se crean dos objetos `Person`:
  - Uno usando el **constructor completo** con nombre y edad.
  - Otro usando un **constructor sobrecargado** que solo recibe el nombre (la edad se asigna por defecto).
- Esto muestra cómo puedes adaptar la creación de objetos según la información disponible.

---

### 🔸 Uso de métodos `introduce()` sobrecargados

```java
        fullInfoPerson.introduce(); // Usando método original
        nameOnlyPerson.introduce(); // Edad por defecto
```

- Se llama al método `introduce()` sin argumentos.  
  Este método muestra el nombre y la edad de la persona.

```java
        fullInfoPerson.introduce("Hello everyone, nice to meet you!");
        nameOnlyPerson.introduce("¡Saludos desde el mundo Java!");
```

- Aquí se llama una versión sobrecargada de `introduce()` que recibe un **mensaje personalizado** como parámetro.
- Este es un ejemplo clásico de **sobrecarga de métodos**: mismo nombre, distinta firma.

---

### 🔸 Sobrecarga de métodos estáticos en `UniversityUtils`

```java
        UniversityUtils.welcomeMessage(); // Original
```

- Se llama al método original `welcomeMessage()` que imprime un saludo genérico.

```java
        UniversityUtils.isAdult("Andrea", fullInfoPerson.getAge()); // Versión sobrecargada
        UniversityUtils.isAdult("Diego", nameOnlyPerson.getAge());
```

- Aquí se utiliza una **versión sobrecargada del método `isAdult`** que acepta un nombre junto con la edad.
- La idea es enriquecer el mensaje sin cambiar el método original: otra ventaja de la sobrecarga.

---

## ✅ Conceptos clave aplicados

| Concepto                    | Aplicación en el código                                  |
| --------------------------- | -------------------------------------------------------- |
| Sobrecarga de constructores | `Person(String name)` y `Person(String name, int age)`   |
| Sobrecarga de métodos       | `introduce()` y `introduce(String greeting)`             |
| Métodos estáticos           | `UniversityUtils.isAdult(int)` vs `isAdult(String, int)` |
| Reutilización de clases     | Uso de `Person` y `UniversityUtils` sin modificarlas     |

---
