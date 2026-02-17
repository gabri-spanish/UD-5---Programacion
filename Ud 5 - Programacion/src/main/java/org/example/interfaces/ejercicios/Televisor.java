package org.example.interfaces.ejercicios;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

    @Override
    public void encender() {
        if (super.estado) {
            System.out.println("El televisor está encendido...");
        } else {
            System.out.println("Encendiendo televisor...");
            super.estado = true;
        }
    }

    @Override
    public void apagar() {
        super.apagar();
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
    }

}
