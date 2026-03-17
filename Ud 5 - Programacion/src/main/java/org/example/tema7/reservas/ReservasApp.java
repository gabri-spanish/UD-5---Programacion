package org.example.tema7.reservas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ReservasApp {
    static HashMap<Usuario, HashSet<Reservas>> mapa = new HashMap<>();

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static void eliminar(HashSet<Reservas> listaReserva) {
        System.out.print("Qué tipo de pista quieres elimniar: ");
        String pista = teclado.nextLine();

        Iterator<Reservas> it = listaReserva.iterator();
        while (it.hasNext()) {
            Reservas reservas = it.next();
            if (reservas.getPista() instanceof Tenis && pista.equals("tenis")) {
                it.remove();
            }

            if (reservas.getPista() instanceof padel && pista.equals("padel")) {
                it.remove();
            }
        }
    }

    public static HashSet<Reservas> listaReserva(Usuario usuario) {
        return mapa.get(usuario);
    }

    public static void reservaCrear(Usuario usuario, Pista pista) {
        Reservas reservas = new Reservas(usuario,pista);
        HashSet<Reservas> lista = listaReserva(usuario);
        if (lista.contains(reservas)) {
            throw new ReservaDuplicada("Ya hay una pista reservada con este nombre");
        } else {
            lista.add(reservas);
            mapa.put(usuario,lista);
        }
    }
}
