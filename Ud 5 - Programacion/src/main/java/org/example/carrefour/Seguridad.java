package org.example.carrefour;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona {

    static Scanner teclado = new Scanner(System.in);

    private String Empresa;
    private ArrayList<String> armas;


    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {
        super(codigo, nombre, sueldo);
        setEmpresa();
        setArmas();
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa() {
        System.out.println("Introduce la empresa a la que pertenece el segurata...");
        Empresa = teclado.nextLine();
    }

    private void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    private void insertarArmas (String arma) {
        armas.add(arma);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Segurata que viene de parte de la " + Empresa);
        System.out.println("Las armas que tiene son ");
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "Empresa=" + Empresa +
                '}';
    }

}
