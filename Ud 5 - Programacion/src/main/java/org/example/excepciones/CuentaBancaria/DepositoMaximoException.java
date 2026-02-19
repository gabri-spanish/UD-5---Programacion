package org.example.excepciones.CuentaBancaria;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("Se sobreexcede el máximo que se puede depositar");
    }
}
