package org.example.excepciones.CuentaBancaria;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("No cuentas con suficiente saldo en tu cuenta...");
    }
}
