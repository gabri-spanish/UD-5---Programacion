package org.example.interfaces.ejercicios;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (super.estado) {
            System.out.println("El parlante ya está encendido");
        } else {
            System.out.println("Encendiendo parlante con comando de voz... ");
            super.estado = true;
        }
    }


}
