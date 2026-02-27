package org.example.exament6;

import java.util.Scanner;

public abstract class Participante {

    Scanner teclado = new Scanner(System.in);

    private static String nombre;
    private String pais;

    public Participante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais() {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre: '" + nombre + '\'' +
                ", pais: '" + pais + '\'' +
                '}';
    }
}
