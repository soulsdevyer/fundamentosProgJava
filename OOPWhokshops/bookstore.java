package OOPWhokshops;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta común a todos los materiales.
 */
abstract class MaterialBiblioteca {
    // Atributos privados
    private String titulo;
    private boolean disponible = true;

    /*------------------  Constructores  ------------------*/
    public MaterialBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    /*------------------  Comportamiento  ------------------*/
    /** Cambia disponible a false. */
    public void prestar() {
        disponible = false;
    }

    /** Cambia disponible a true. */
    public void devolver() {
        disponible = true;
    }

    /** @return true si está disponible para préstamo. */
    public boolean estaDisponible() {
        return disponible;
    }

    /** Descripción específica según el tipo de material. */
    public abstract String obtenerDescripcion();

    /*------------------  Getters ------------------*/
    protected String getTitulo() { // visible para las subclases
        return titulo;
    }
}

class Libro extends MaterialBiblioteca {
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        super(titulo);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Libro: %s, Autor: %s, %d páginas",
                getTitulo(), autor, paginas);
    }
}

class Revista extends MaterialBiblioteca {
    private int numeroEdicion;

    public Revista(String titulo, int numeroEdicion) {
        super(titulo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Revista: %s, Edición: %d",
                getTitulo(), numeroEdicion);
    }
}

class Biblioteca {

    private final List<MaterialBiblioteca> materiales = new ArrayList<>();

    /** Agrega un material a la colección. */
    public void agregarMaterial(MaterialBiblioteca m) {
        materiales.add(m);
    }

    /** Imprime en consola la descripción de los materiales disponibles. */
    public void mostrarDisponibles() {
        materiales.stream()
                .filter(MaterialBiblioteca::estaDisponible)
                .map(MaterialBiblioteca::obtenerDescripcion)
                .forEach(System.out::println);
    }
}

class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear materiales
        Libro libro = new Libro("El nombre del viento",
                "Patrick Rothfuss", 662);
        Revista revista = new Revista("National Geographic", 157);

        // Añadir a la biblioteca
        biblioteca.agregarMaterial(libro);
        biblioteca.agregarMaterial(revista);

        // Prestar el libro
        libro.prestar();

        // Mostrar únicamente los materiales disponibles
        biblioteca.mostrarDisponibles();
    }
}
