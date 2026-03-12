package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> listaNums = new ArrayList<>();

        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce el primer número: ");
        int primernum = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int segunum = teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        int ternum = teclado.nextInt();

        pila.push(primernum);
        pila.push(segunum);
        pila.push(ternum);

        for (int i = 0; i < 3; i++) {
            System.out.println(pila.pop());
        }
    }
}
