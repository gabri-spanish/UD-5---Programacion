package org.example.bateriaEj;

public class Televisor {

    private static final int DEF_CANAL = 1;
    private static final int DEF_VOLUMEN = 5;
    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen) {

        this.canal = canal;
        this.volumen = volumen;

    }

    public Televisor () {
        canal = DEF_CANAL;
        volumen = DEF_VOLUMEN;
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

    public void subirCanal() {
        if (canal == 100) {
            canal = 1;
        } else {
            canal = canal + 1;
        }

        System.out.println("Canal: " + canal);

    }

    public void bajarCanal() {

        if (canal == 1) {
            canal = 100;
        } else {
            canal = canal - 1;
        }

        System.out.println("Canal: " + canal);

    }

    public void subirVolumen() {
        if (volumen == 100) {
            volumen = volumen;
        } else {
            volumen = volumen + 1;
        }

        System.out.println("Volumen: " + volumen);

    }

    public void bajarVolumen() {
        if (volumen == 0) {
            volumen = volumen;
        } else {
            volumen = volumen - 1;
        }

        System.out.println("Volumen: " + volumen);

    }

}
