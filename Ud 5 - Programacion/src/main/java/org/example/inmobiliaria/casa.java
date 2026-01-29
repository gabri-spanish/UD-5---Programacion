package org.example.inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class casa {

    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<habitacion> listaHabitaciones;
    private propietario propietario;
    public casa(String direccion) {
        this.direccion = direccion;
        this.listaHabitaciones = new ArrayList<>();
        setPropietario();

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

    public void eliminarHabitaciones(String nombre) {

        for (habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitación " + nombre + " eliminada con éxito.");
                return;
            }
        }

        System.out.println("La habitación " + nombre + " no existe.");

    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " con propietario siendo " + propietario.getNombre() + ", tiene " + listaHabitaciones.size() + " habitaciones.");
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


    public propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario: ");
        String nombre = teclado.next();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        propietario propietario = new propietario(nombre, edad);
        this.propietario = propietario;
        System.out.println("Propietario: " + nombre + " añadido.");
    }


    @Override
    public String toString() {
        return "casa{" +
                "direccion='" + direccion + '\'' +
                ", listaHabitaciones=" + listaHabitaciones +
                '}';
    }

}
