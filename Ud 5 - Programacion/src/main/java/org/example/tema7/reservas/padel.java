package org.example.tema7.reservas;

public class padel extends Pista {

    private String paredes;
    public padel(int id, String techado, String paredes) {
        super(techado, id);
        this.paredes = paredes;
    }
}
