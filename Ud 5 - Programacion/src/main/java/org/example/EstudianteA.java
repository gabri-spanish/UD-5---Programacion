package org.example;

import java.io.FilterOutputStream;

public class EstudianteA {

    public static void main(String[] args) {
        Estudiante jorge = new Estudiante("jorge", "1DAM", "jorge@iesmutxamel.com");

        System.out.println(jorge.getNia());
        System.out.println(jorge);
        Estudiante raul = new Estudiante("raul");

        System.out.println(raul.getNia());
        System.out.println(raul);
    }


}
