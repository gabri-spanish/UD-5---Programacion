package org.example.polimorfismo;

abstract class Persona {
    String nombre;
    int edad;

    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //método tradicional (con implementación)
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    //método abstracto (sin implementación)
    public abstract void accederEvento();

}
