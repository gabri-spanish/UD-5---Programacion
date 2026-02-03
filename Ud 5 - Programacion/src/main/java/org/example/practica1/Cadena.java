package org.example.practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadena {

    static Scanner teclado = new Scanner(System.in);

    private String nombre;

    public Cadena(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
