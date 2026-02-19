package org.example.excepciones.CuentaBancaria;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("Se supera el límite diario de dinero que puedes retirar");
    }
}
