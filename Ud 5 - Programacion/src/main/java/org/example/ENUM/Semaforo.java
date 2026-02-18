package org.example.ENUM;

public enum Semaforo {
    ROJO, VERDE, AMARILLO;

    public Semaforo siguiente() {
        switch (this) {
            case AMARILLO:
                return ROJO;
            case ROJO:
                return VERDE;
            case VERDE:
                return AMARILLO;
            default:
                return AMARILLO;

        }
    }
}