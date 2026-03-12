package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ej2 {

    public static void main(String[] args) {

        Queue<String> colaImpresion = new LinkedList<>();

        System.out.println("Estado inicial de la impresora:");
        mostrarCola(colaImpresion);

        colaImpresion.add("Imprimir documento 1");
        colaImpresion.add("Imprimir documento 2");
        colaImpresion.add("Imprimir documento 3");
        colaImpresion.add("Imprimir documento 4");

        System.out.println("Trabajos añadidos a la cola:");
        mostrarCola(colaImpresion);

        while (!colaImpresion.isEmpty()) {
            System.out.println("--------------------------------------");
            System.out.println("Cola antes de procesar el trabajo:");
            mostrarCola(colaImpresion);

            String trabajoActual = colaImpresion.poll();
            System.out.println("Procesando: " + trabajoActual);

            System.out.println("Cola después de procesar el trabajo:");
            mostrarCola(colaImpresion);
        }

        System.out.println("\nTodos los trabajos han sido procesados.");
    }

    public static void mostrarCola(Queue<String> cola) {
        if (cola.isEmpty()) {
            System.out.println("[La cola está vacía]");
        } else {
            System.out.println(cola);
        }
    }
}

