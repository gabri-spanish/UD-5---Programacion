package org.example.excepciones.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int saldo;
        System.out.println("=== Cajero automático ===");
        System.out.println("     [1]. Consultar saldo");
        System.out.println("     [2]. Ingresar dinero");
        System.out.println("     [3]. Retirar dinero");
        System.out.println("     [X]. Salir");

        System.out.print("Selecciona una opción: ");
        byte opciones = teclado.nextByte();
    }
}
