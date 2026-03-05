package org.example.tema7;

import java.util.Deque;
import java.util.LinkedList;

public class ej5 {


    public static void main(String[] args) {
        Deque<Character> lista = new LinkedList<>();
        String palabra = "aibofobia";

        for (int i = 0; i < palabra.length(); i++) {
            lista.offer(palabra.charAt(i));
        }

        while (!lista.isEmpty()) {
            if (lista.peekLast() == lista.peekFirst()) {
                lista.pollFirst();
                lista.pollLast();
            } else {
                System.out.println("No es palíndroma");
                break;
            }

        }
        if (lista.isEmpty()) {
            System.out.println("Palabra palíndroma");
        }

    }
}


