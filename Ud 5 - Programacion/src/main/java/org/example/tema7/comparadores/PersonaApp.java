package org.example.tema7.comparadores;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonaApp {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
        new Persona("Juan", "Pérez"),
        new Persona("Ana", "Gómez") ,
        new Persona("Carlos", "López"),
        new Persona("Beatriz", "López"),
        new Persona("Pedro", "Pérez")
        );

        Collections.sort(personas);
        System.out.println(personas);
    }
}
