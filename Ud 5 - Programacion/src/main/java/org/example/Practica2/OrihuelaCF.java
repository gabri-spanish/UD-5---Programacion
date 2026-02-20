package org.example.Practica2;

public abstract class OrihuelaCF implements FuncionesIntegrantes {

    String nombre;
    private int edad;


    public OrihuelaCF(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " concentrándose para el partido");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOL DE " + nombre);
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad + " para el partido");
    }
}
