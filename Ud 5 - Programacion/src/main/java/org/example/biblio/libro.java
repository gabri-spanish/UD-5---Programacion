package org.example.biblio;

public class libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String CADENA_ID = "LIB";

    private static String id;
    private static String titulo;
    private static String autor;
    private static boolean disponible;
    private Estudiante estudiantePrestado;
    private editorial editorial;


    public libro(String cumbresBorrascosas, String emilyBronte, editorial editorial) {

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        id = generarID();
        cantidadLibros++;
        librosDisponibles++;
        estudiantePrestado = new Estudiante("");
        this.editorial = editorial;

    }

    private String generarID () {
        return CADENA_ID+cantidadLibros;
    }



    public Prestamo prestar(Estudiante estudiante){

        Prestamo prestamo = null;
        if (disponible && estudiante.getLibro() == null) {
            disponible = false;
            System.out.println("El libro " + titulo + " ha sido prestado");
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.setLibro(this);
            prestamo = new Prestamo(this,estudiante);
        } else if (estudiante.getLibro() == null) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado");
        } else {
            System.out.println("El libro " + titulo + " no está disponible");
        }

        return prestamo;

    }

    public void devolver(Estudiante estudiante) {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto");
            librosDisponibles++;
            estudiantePrestado.setLibro(null);
            estudiantePrestado = null;
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

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(editorial editorial) {
        this.editorial = editorial;
    }


    @Override
    public String toString() {
        return "libro{" +
                "Total de libros creados: " + cantidadLibros +
                "Libros disponibles: " + librosDisponibles +
                "ID del libro: " + id +
                "Título del libro: " + titulo +
                "Autor/a del libro: " + autor +
                "Está disponible?: " + disponible +
                "Editorial: " + editorial +
                "}";
    }


}
