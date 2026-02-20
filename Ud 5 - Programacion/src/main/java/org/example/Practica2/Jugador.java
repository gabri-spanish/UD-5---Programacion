package org.example.Practica2;

public class Jugador extends OrihuelaCF implements AccionesDeportivas {

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    @Override
    public void entrenar() {
    System.out.println("Preparándose para el partido...");
    }

    @Override
    public void JugarPartido(String rival) {
        System.out.println("Jugando en el partido contra el " + rival);
    }

    public void calentar() {
        System.out.println("Salta al calentar el jugador " + nombre + ", con el dorsal " + dorsal);
    }

}
