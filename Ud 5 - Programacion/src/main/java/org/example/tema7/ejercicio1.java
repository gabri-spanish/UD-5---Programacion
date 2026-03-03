package org.example.tema7;

import java.util.ArrayList;
import java.util.Stack;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> listaLetras= new ArrayList<>();

        Stack<String> pila = new Stack<>();

        pila.push("a");
        pila.push("b");
        pila.push("c");
        pila.push("d");
        pila.push("e");

        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
        System.out.println(pila.peek());
        for (int i = 0; i < 5; i++) {
            System.out.println(pila.pop());
        }

    }
}
