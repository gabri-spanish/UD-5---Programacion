package org.example.interfaces;

import java.util.ArrayList;

public class VoladoresApp {
    public static void main(String[] args) {
        Superman clark_kent = new Superman();
        Pajaro piolin = new Pajaro();
        Spiderman peter_parker = new Spiderman();

        ArrayList<Superheroes> listaHeroes = new ArrayList<>();
        listaHeroes.add(clark_kent);
        listaHeroes.add(peter_parker);

        for (Superheroes superheroes : listaHeroes) {
            if (superheroes instanceof Superman) {
                ((Superman) superheroes).rayoLaser();
                ((Superman) superheroes).rayoLaser();
            }
        }

    }
}
