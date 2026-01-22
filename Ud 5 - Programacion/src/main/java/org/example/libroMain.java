package org.example;

public class libroMain {
    public static void main(String[] args) {

        libro cumbres = new libro("Cumbres Borrascosas", "Emily Bronte");
        System.out.println(cumbres);

        cumbres.prestar();
        cumbres.prestar();
        System.out.println(cumbres.estaDisponible());
        System.out.println("Libros disponibles: " + libro.getCantidadLibros());
        System.out.println("Libros creados: " + libro.getTotalLibros());
        cumbres.devolver();
        cumbres.devolver();
        System.out.println(cumbres.estaDisponible());

        System.out.println("Libros disponibles: " + libro.getCantidadLibros());
        System.out.println("Libros creados: " + libro.getTotalLibros());

    }

}
