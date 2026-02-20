package org.example.Practica2;

public class Entrenador extends OrihuelaCF implements AccionesDeportivas {

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public void entrenar() {
        System.out.println("Preparando el entrenamiento antes del partidazo...");
    }

    @Override
    public void JugarPartido(String rival) {

    }
}
