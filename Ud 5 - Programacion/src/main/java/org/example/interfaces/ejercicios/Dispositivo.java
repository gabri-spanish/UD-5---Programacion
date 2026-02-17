package org.example.interfaces.ejercicios;

public abstract class Dispositivo {

    protected String nombre;
    protected boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("El dispositivo " + nombre + " ha sido encendido");
        } else {
            System.out.println("Este dispositivo ya está encendido");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("Dispositivo llamado " + nombre + " ha sido apagado");
        } else if (estado = false) {
            System.out.println("El dispositivo " + nombre + " ya está apagado");
        }
    }

    public void mostrarEstado() {
        if (estado = true) {
            System.out.println("El dispositivo " + nombre + " se encuentra encendido");
        } else {
            System.out.println("El dispositivo " + nombre + " se encuentra apagado");
        }
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }

}
