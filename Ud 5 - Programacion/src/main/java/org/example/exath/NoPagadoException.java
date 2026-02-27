package org.example.exath;

public class NoPagadoException extends RuntimeException {
    public NoPagadoException() {
        super("El expediente todavia no esta pagado: ");
    }
}
