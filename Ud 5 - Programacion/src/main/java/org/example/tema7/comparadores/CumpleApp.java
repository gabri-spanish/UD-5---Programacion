package org.example.tema7.comparadores;

import java.util.ArrayList;
import java.util.Collections;

public class CumpleApp {
    public static void main(String[] args) {
        ArrayList<Invitado> invitados = new ArrayList<>();
        invitados.add((new Invitado(15, "Jacobo")));
        invitados.add((new Invitado(12, "David")));
        invitados.add((new Invitado(12, "Joaquín")));
        invitados.add((new Invitado(50, "Jeffrey")));

        Collections.sort(invitados);
        System.out.println(invitados);
    }
}
