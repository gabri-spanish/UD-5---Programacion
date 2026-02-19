package org.example.excepciones.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    static Scanner teclado = new Scanner(System.in);

    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo del que dispones actualmente: " + saldo);
    }

    public void ingresarDinero() {
        System.out.println("Selecciona el importe a ingresar...");
        double ingresar = teclado.nextDouble();

        if (ingresar > 3000) {
            throw new DepositoMaximoException();
        } else {
            saldo = ingresar + saldo;
            System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo + "€");
        }
    }

    public void retirarDinero() {
        System.out.println("Selecciona el importe a retirar...");
        double retirar = teclado.nextDouble();

        if (retirar > saldo) {
            throw new SaldoInsuficienteException();
        }
        else if (retirar > 600) {
            throw new LimiteDiarioException();
        } else {
            saldo = saldo - retirar;
            System.out.println("Dinero retirado con éxito. Saldo actual: " + saldo + "€");
        }
    }
}
