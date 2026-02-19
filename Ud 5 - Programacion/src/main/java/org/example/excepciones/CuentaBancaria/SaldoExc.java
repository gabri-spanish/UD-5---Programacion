package org.example.excepciones.CuentaBancaria;

public class SaldoExc extends RuntimeException {
    public SaldoExc() {
        super("No cuentas con suficiente saldo en tu cuenta...");
    }
}
