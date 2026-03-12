package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejer3G {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra = "";

        LinkedHashSet<String>set = new LinkedHashSet<>();

        while (!palabra.toLowerCase().equals("salir")) {
            System.out.println("Escribe una URL (o 'salir' para terminar)");
            palabra = teclado.next();

            if (palabra.equals("salir")) {
                break;
            } else {
                set.add(palabra);
            }

        }

        System.out.println("Historial de navegación: ");
        int contador = 1;
        for (String url : set) {
            System.out.println(contador + ". " + url);
            contador++;
        }
    }
}
