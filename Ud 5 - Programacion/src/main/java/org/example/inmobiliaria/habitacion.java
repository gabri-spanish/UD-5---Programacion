package org.example.inmobiliaria;

import java.util.ArrayList;

public class habitacion {

    private String nombre;
    private double metros;
    private ArrayList<electrodomestico> listaElectrodomesticos;

    public habitacion(String nombre, double metros) {
        this.nombre = nombre;
        this.metros = metros;
    }

    public void crearElectrodomestico(String nombre, double consumo) {
        for (electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico.getNombre().equals(nombre)) {
                System.out.println("El electrodoméstico, con un consumo de " + consumo + "kWh" + nombre + " ya existe");
                return;
            }
        }

        electrodomestico electrodomestico = new electrodomestico(nombre,metros);
        listaElectrodomesticos.add(electrodomestico);
        System.out.println("Electrodoméstico " + nombre + " creado.");
    }

    public void eliminarElectrodomesico(String nombre) {

        for (electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico.getNombre().equals(nombre)) {
                listaElectrodomesticos.remove(electrodomestico);
                System.out.println("Electrodoméstico " + nombre + " eliminado con éxito.");
                return;
            }
        }

        System.out.println("El electrodomético " + nombre + " no existe.");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public ArrayList<electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    @Override
    public String toString() {
        return "habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

}
