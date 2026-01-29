package org.example.inmobiliaria;

import java.util.ArrayList;

public class casa {


    private String direccion;
    private ArrayList<habitacion> listaHabitaciones;
    public casa(String direccion) {
        this.direccion = direccion;
        this.listaHabitaciones = new ArrayList<>();
    }

    public void crearHabitacion(String nombre, double metros) {

        for (habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                System.out.println("La habitación " + nombre + " ya existe");
                return;
            }
        }

        habitacion habitacion = new habitacion(nombre,metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitación " + nombre + " creada.");
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + listaHabitaciones.size() + " habitaciones.");
        for (habitacion habitacion : listaHabitaciones) {
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") metros cuadrados");
        }
    }

    public habitacion getHabitacionMasGrande() {
        habitacion mayor = listaHabitaciones.get(0);

        for (habitacion habitacion : listaHabitaciones) {
            if (habitacion.getMetros() > mayor.getMetros()) {
                mayor = habitacion;
            }
        }

        return mayor;

    }

    public ArrayList<habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "casa{" +
                "direccion='" + direccion + '\'' +
                ", listaHabitaciones=" + listaHabitaciones +
                '}';
    }

}
