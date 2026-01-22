package org.example;

public class libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String CADENA_ID = "LIB";

    private static String id;
    private static String titulo;
    private static String autor;
    private static boolean disponible;

    public libro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        id = generarID();
        cantidadLibros++;
        librosDisponibles++;

    }

    private String generarID () {
        return CADENA_ID+cantidadLibros;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro " + titulo + " ha sido prestado");
            librosDisponibles--;
        } else {
            System.out.println("El libro " + titulo + " no está disponible");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto");
            librosDisponibles++;
        } else {
            System.out.println("El libro " + titulo + " no se puede devolver ya que está disponible para prestar");
        }
    }

    public static int getTotalLibros () {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public static void setId(String id) {
        libro.id = id;
    }

    public static void setNombreLibro(String titulo) {
        libro.titulo = titulo;
    }

    public static void setAutor(String autor) {
        libro.autor = autor;
    }

    public static void setDisponible(boolean disponible) {
        libro.disponible = disponible;
    }

    public static void setCantidadLibros(int cantidadLibros) {
        libro.cantidadLibros = cantidadLibros;
    }

    public static void setLibrosDisponibles(int librosDisponibles) {
        libro.librosDisponibles = librosDisponibles;
    }

    public static String getId() {
        return id;
    }

    public static String getTitulo() {
        return titulo;
    }

    public static String getAutor() {
        return autor;
    }

    public static boolean estaDisponible() {
        return disponible;
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    @Override
    public String toString() {
        return "libro { Total de libros creados: " + cantidadLibros +
                " " +
                "Libros disponibles: " + librosDisponibles +
                " " +
                "ID del libro: " + id +
                " " +
                "Título del libro: " + titulo +
                " " +
                "Autor/a del libro: " + autor +
                " " +
                "Está disponible? }" + disponible;
    }


}
