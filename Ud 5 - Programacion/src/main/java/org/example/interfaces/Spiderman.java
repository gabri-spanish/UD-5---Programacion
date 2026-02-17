package org.example.interfaces;

public class Spiderman extends Superheroes implements Volador {
    @Override
    public void volar() {
        System.out.println("Saltando edificios con la tela de araña!!");
    }
}
