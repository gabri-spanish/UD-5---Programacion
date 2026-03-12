package org.example.tema7.iteradores;

import org.example.Presidentes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class iteradoresObjetos {
    public static void main(String[] args) {
        ArrayList<Presidentes> lista = new ArrayList<>(Arrays.asList(
        new Presidentes("Donald Trump", "USA"),
        new Presidentes("BiBi Netanyahu", "ISRAEL"),
        new Presidentes("Pedro Sánchez", "ESPAÑA")));

        Iterator<Presidentes> it = lista.iterator();

        while (it.hasNext()) {
            Presidentes presi = it.next();

            if (presi.getNombre().equals("BiBi Netanyahu")) {
                it.remove();
            }

            System.out.println(lista);
        }
    }
}
