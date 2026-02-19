package org.example.excepciones;

public class EdadValida extends RuntimeException {
    public EdadValida() {
        super("edad no válida");
    }
}
