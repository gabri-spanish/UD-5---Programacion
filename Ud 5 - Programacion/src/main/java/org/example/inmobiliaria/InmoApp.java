package org.example.inmobiliaria;

public class InmoApp {
    public static void main(String[] args) {
        casa pisito = new casa("Calle Falsa 123");

        pisito.crearHabitacion("cocina", 20);
        pisito.crearHabitacion("baño", 7);
        pisito.crearHabitacion("dormitorio", 21);
        pisito.crearHabitacion("dormitorio", 12);

        pisito.mostrarHabitaciones();
        System.out.println("La habitación más grande es " + pisito.getHabitacionMasGrande().getNombre());

    }
}
