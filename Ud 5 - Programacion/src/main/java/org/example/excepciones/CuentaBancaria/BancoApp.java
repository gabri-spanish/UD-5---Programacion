package org.example.excepciones.CuentaBancaria;

import java.util.Scanner;

public class BancoApp {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(500.0);
        menu(cuenta);
    }

    public static void imprimirMenu() {
        System.out.println("=== Cajero automático ===");
        System.out.println("    [1]. Consultar dinero");
        System.out.println("    [2]. Ingresar dinero");
        System.out.println("    [3]. Retirar dinero");
        System.out.println("    [X]. Salir");
        opcion();
    }

    public static void menu(CuentaBancaria cuenta) {
     imprimirMenu();
     switch (opcion()) {
         case '1':
             cuenta.consultarSaldo();
             menu(cuenta);
         case '2':
             cuenta.ingresarDinero();
             menu(cuenta);
         case '3':
             cuenta.retirarDinero();
             menu(cuenta);
         case 'X':
             return;
         default:
             System.out.println("No es una opción válida");
     }

    }

    private static char opcion() {
        System.out.println("Introduce una opción: ");
        return teclado.next().toUpperCase().charAt(0);
    }

}
