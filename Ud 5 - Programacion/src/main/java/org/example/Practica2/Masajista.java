package org.example.Practica2;

public class Masajista extends OrihuelaCF {

    private String titulacion;
    private int añosExperiencia;

    public Masajista (String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(Jugador jugador) {
        System.out.println("Dándole un masaje a " + jugador);
    }

}
