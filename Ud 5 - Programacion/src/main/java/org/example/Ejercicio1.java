package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase...");
        String[] frase = teclado.nextLine().toLowerCase().split(" ");
        LinkedHashSet<String> orden = new LinkedHashSet<>();
        for (int i = 0; i<frase.length; i++) {
            orden.add(frase[i]);
        }

        System.out.println(orden);

    }
}
