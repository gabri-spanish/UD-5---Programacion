package org.example.tema7.comparadores;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;


public class Invitado implements Comparable<Invitado>{

    private LocalTime hora;
    private int edad;
    private String nombre;

    public Invitado(int edad, String nombre) {
        this.hora = LocalTime.now();
        this.edad = edad;
        this.nombre = nombre;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Invitado invitado) {

        int comparar = edad;;

        if (comparar != 0) {
            return comparar;
        }
        comparar = hora.compareTo(invitado.getHora());

        if (comparar != 0) {
            return comparar;
        }



        return nombre.compareTo(invitado.getNombre());
    }
}
