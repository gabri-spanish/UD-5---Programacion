package org.example.exament6;

public class ValidacionException extends RuntimeException {
    public ValidacionException(String message) {
        super("El coche no puede pasar a APTO si no está revisado");
    }
}
