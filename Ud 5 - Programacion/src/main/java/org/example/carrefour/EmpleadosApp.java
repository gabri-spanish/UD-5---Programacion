package org.example.carrefour;

public class EmpleadosApp {
    public static void main(String[] args) {

         Cajero Jorge = new Cajero(147, "Jorge", 1800);
         Jorge.mostrarInfo();

         Reponedor Juan = new Reponedor(121, "Juan", 1200);
         Juan.mostrarInfo();

         Seguridad Carlos = new Seguridad(123, "Carlos", 900, "FaliyoCorp");

    }
}
