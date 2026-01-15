package org.example;

public class Main {
    public static void main(String[] args) {

        bocadillo pepito = new bocadillo("pepito", "normal", "bacon", "Bigmac", 10);

        pepito.ImprimirInfoBocata();

        bocadillo vacio = new bocadillo();

        vacio.ImprimirInfoBocata();

        vacio = new bocadillo();

        vacio.setNombre("chivito");

        vacio.ImprimirInfoBocata();
    }
}