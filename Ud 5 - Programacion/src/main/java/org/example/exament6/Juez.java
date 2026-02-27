package org.example.exament6;

public class Juez extends Participante implements AccionesCarrera {

    private EstadoCoche estado;

    public Juez(String nombre, String pais) {
        super(nombre, pais);
    }

    public Inscripcion inscribir(String nombre, String pais) {

        System.out.println("Inscribiendo participante...");
        System.out.println("Nombre:");
        nombre = teclado.nextLine();
        System.out.println("País:");
        pais = teclado.nextLine();
        System.out.println("Juez " + nombre + " creado");
        return null;
    }

    public EstadoCoche getEstado() {
        return estado;
    }

    @Override
    public void validarInscripciones(Inscripcion inscripcion) {

    }

    @Override
    public void darSalida() {
        System.out.println("Empieza la carrera!");
    }

    @Override
    public void puntuar(Piloto piloto) {
        System.out.println("Puntaje del piloto ");
    }
}
