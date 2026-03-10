package org.example.tema7.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una palabra...");
        String palabra = teclado.nextLine();

        HashMap<Character, Integer> mapita = new HashMap<>();

        for (char caracter : palabra.toCharArray()) {
            if (mapita.containsKey(caracter)) {
                mapita.put(caracter,mapita.get(caracter)+1);
            } else {
                mapita.put(caracter, 1);
            }
        }

        for (Map.Entry<Character, Integer> mapa : mapita.entrySet()) {
            System.out.println(mapa.getKey() + " : " + mapa.getValue() + " veces");
        }
    }
}
