package org.example.bateriaEj;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen) {

        this.canal = canal;
        this.volumen = volumen;

    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void ImprimirInfoCanal() {

        System.out.println("Canal en el que estás: " + canal);
        System.out.println("Volumen actual: " + volumen);

    }

}
