package org.example.tema7.comparadores;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private final String apellido;
    private final String nombre;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String toString() {
        return apellido + ", " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona)) return false;
        Persona p = (Persona) o;
        return nombre.equals(p.nombre) && apellido.equals(p.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public int compareTo(Persona otra) {
        int comparacionApellido = apellido.compareTo(otra.apellido);

        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        return nombre.compareTo(otra.nombre);
    }
}
