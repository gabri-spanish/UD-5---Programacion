package org.example.carrefour;

import java.util.Scanner;

public class Reponedor extends Persona {

    static Scanner teclado = new Scanner(System.in);

    private int pasillo;

    public Reponedor(int codigo, String nombre, double sueldo) {
        super(codigo, nombre, sueldo);
        setPasillo();
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo() {
        System.out.println("Introduce el pasillo en el que trabaja el reponedor...");
        pasillo = teclado.nextInt();
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Reponedor que trabaja en " + pasillo);
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo=" + pasillo +
                '}';
    }




}
