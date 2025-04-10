# 📘 Fundamentos de la Programación Orientada a Objetos (POO) en Java

La Programación Orientada a Objetos (POO) es un paradigma de desarrollo muy utilizado en el mundo del software. Java es uno de los lenguajes más populares para aprender este enfoque debido a su sintaxis clara y su fuerte soporte para estos conceptos.

---

## 🧱 ¿Qué es un objeto?

Un objeto es una **unidad básica del código orientado a objetos**. Representa una "cosa" del mundo real o lógico y combina dos elementos:

- **Atributos**: las características o propiedades del objeto.
- **Métodos**: las acciones o comportamientos que el objeto puede realizar.

Por ejemplo, si pensáramos en un "Estudiante", sus atributos podrían ser nombre y edad, y sus métodos podrían ser estudiar o rendir examen.

---

## 🏗️ ¿Qué es una clase?

Una clase es un **molde o plantilla** que define cómo se construyen los objetos. En la clase se especifican qué atributos y métodos tendrá un objeto.

Cuando se crea un objeto, se dice que se ha creado una **instancia** de la clase.

---

## 📦 Encapsulamiento

El encapsulamiento consiste en **proteger los datos del objeto** de accesos no autorizados o indebidos. Esto se logra **restringiendo el acceso a los atributos** y permitiendo su manipulación solo a través de métodos públicos.

La idea es mantener cada objeto como una "caja negra": desde afuera no se ve cómo funciona internamente, pero se puede interactuar con él a través de métodos bien definidos.

---

## 🧬 Herencia

La herencia permite que una clase **pueda heredar atributos y métodos** de otra clase. Esto facilita la reutilización de código y ayuda a organizar jerárquicamente los conceptos.

Cuando una clase hereda de otra:

- La clase base se conoce como **superclase**.
- La clase derivada se llama **subclase**.

La subclase puede usar todo lo que está definido en la superclase, y además, puede **agregar o modificar comportamientos**.

---

## 🎭 Polimorfismo

El polimorfismo permite que un mismo método o acción pueda **funcionar de distintas maneras dependiendo del contexto**.

Existen dos tipos principales de polimorfismo:

1. **Polimorfismo en tiempo de compilación (sobrecarga)**: permite definir múltiples métodos con el mismo nombre pero distintos parámetros.
2. **Polimorfismo en tiempo de ejecución (sobrescritura)**: permite redefinir el comportamiento de un método heredado en una subclase.

Esto hace que el código sea más flexible, reutilizable y fácil de extender.

---

## ✂️ Abstracción

La abstracción consiste en **ocultar los detalles internos del funcionamiento** de un objeto y exponer solo lo necesario para su uso.

Por ejemplo, cuando usas un teléfono móvil, no necesitas saber cómo funciona internamente para poder llamarle a alguien. Solo necesitas usar una interfaz sencilla.

En programación, esto se logra mediante:

- **Interfaces**: contratos que indican qué métodos deben implementarse, pero no definen cómo.
- **Clases abstractas**: clases que no pueden ser instanciadas directamente, y que pueden contener métodos definidos y no definidos (abstractos).

---

## 📌 Otros conceptos importantes

### Constructores

Son métodos especiales que se ejecutan automáticamente al crear un objeto. Sirven para inicializar sus atributos. Cada clase puede tener uno o varios constructores.

### Métodos estáticos

Los métodos estáticos **pertenecen a la clase, no a los objetos**. Se pueden usar sin necesidad de crear una instancia. Son útiles para funciones de utilidad o generales.

### Modificadores de acceso

Controlan qué partes del código pueden acceder a una clase, sus atributos o métodos. Los más comunes son:

- `public`: accesible desde cualquier lugar.
- `private`: accesible solo desde la misma clase.
- `protected`: accesible desde clases del mismo paquete o subclases.

---

## 🧭 Resumen

La Programación Orientada a Objetos permite organizar el código de forma **modular, reutilizable y más cercana al mundo real**. Los conceptos clave son:

- **Clases y objetos**: estructura fundamental.
- **Encapsulamiento**: proteger los datos.
- **Herencia**: reutilizar y extender comportamientos.
- **Polimorfismo**: métodos con múltiples comportamientos.
- **Abstracción**: ocultar la complejidad.

Comprender estos principios te permitirá construir programas más ordenados, escalables y fáciles de mantener.

---

🎓 **Siguiente paso:** ahora que conoces la teoría, te recomendamos explorar los ejemplos prácticos en este repositorio. Comienza con los _Code Snippets_ y avanza hacia los _Code Workshops_ para consolidar tus conocimientos.
