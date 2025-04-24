# 🎓 Herencia en Java – Clase `Student` como Subclase de `Person`

En este ejemplo, aprenderemos cómo una clase llamada `Student` puede **heredar atributos y comportamientos** de una clase base llamada `Person`.

La clase `Student` agrega nuevos atributos (como la carrera) y **reutiliza lógica existente** del padre usando `super`.

---

## 🔹 Definición de la clase `Student`

```java
/**
 * La clase Student hereda de Person usando "extends".
 * Añade nuevos atributos y reutiliza la lógica de la clase padre.
 */
public class Student extends Person {
```

La instrucción `extends Person` indica que `Student` es una **subclase** de `Person`.

Esto significa que hereda todos los atributos y métodos públicos o protegidos definidos en `Person`, como por ejemplo `getName()` y `getAge()`.

---

### 🔸 Atributo específico de `Student`

```java
    private String major;
```

- `major` representa la **carrera o especialización** del estudiante.
- Se declara como `private` para aplicar **encapsulamiento**, es decir, proteger el acceso directo desde fuera de la clase.
- Se accederá a este atributo a través de los métodos `getMajor()` y `setMajor()`.

---

### 🔸 Constructor con uso de `super`

```java
    public Student(String name, int age, String major) {
        super(name, age); // Llama al constructor de la clase base (Person)
        this.major = major;
    }
```

Este constructor permite inicializar un objeto `Student` pasando los datos básicos (`name` y `age`) y su carrera (`major`).

La línea `super(name, age)` llama al **constructor de la clase padre** (`Person`) para reutilizar su lógica de inicialización.  
Esto evita duplicar código y garantiza que el objeto esté correctamente configurado desde la raíz de la jerarquía.

---

### 🔸 Método propio de `Student`

```java
    public void study() {
        System.out.printf("%s is studying %s.%n", getName(), major);
    }
```

Este método imprime un mensaje que indica qué está estudiando el alumno.

Utiliza el método heredado `getName()` de `Person`, demostrando cómo una subclase puede **combinar información heredada con atributos propios**.

---

### 🔸 Métodos de acceso (getters y setters)

```java
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
```

Estos métodos permiten **acceder y modificar** el atributo `major` de forma segura.

Son una parte esencial del **encapsulamiento**, ya que controlan cómo se interactúa con los atributos privados.

---

## ✅ Conclusión

Este ejemplo es ideal para mostrar cómo se puede **especializar una clase base** añadiendo nuevas funcionalidades, sin perder la estructura general definida por una superclase.

Ahora, podrías crear un `Teacher`, un `Admin`, o incluso un `GraduateStudent` reutilizando esta misma lógica.
