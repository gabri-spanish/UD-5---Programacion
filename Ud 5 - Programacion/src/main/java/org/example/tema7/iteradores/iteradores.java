package org.example.tema7.iteradores;

import javax.swing.*;
import java.util.*;

public class iteradores {
    public static void main(String[] args) {
        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasaur");
        lista.add("Magikarp");

//        for (String pokemon : lista) {
//            if (pokemon.equals("Magikarp")) {
//                lista.remove(pokemon);
//            }
//        }

        Iterator<String> it = lista.iterator();

//       lista.remove("Bulbasaur");

        while (it.hasNext()) {
            String pokemon = it.next();

            if (pokemon.equals("Pikachu")) {
                it.remove();
            }
            System.out.println(pokemon);
        }

        System.out.println(lista);

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Catherine Earnshaw", 7685664);
        mapa.put("Hermione", 7);
        Iterator<Map.Entry<String, Integer>> mapita = mapa.entrySet().iterator();

        while (mapita.hasNext()) {
            Map.Entry<String, Integer> novia = mapita.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue() + " meses con Gabi");

            if (novia.getKey().equals("Hermione")) {
                mapita.remove();
            }
        }

    }
}
