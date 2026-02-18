package org.example.niveles;

import org.example.prueba_enum.Tarjetas;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Dificultad dificultad_tipo;

        System.out.println("Introduce la dificultad (FÁCIL, MEDIO, DIFICIL, EXPERTO): ");
        dificultad_tipo = Dificultad.valueOf(teclado.next());
        System.out.println("Dificultad elegida: " + dificultad_tipo.name());

        Random puntuacion = new Random();
        int puntu = puntuacion.nextInt(1000, 9999);
        final int puntuacion_final = puntu * dificultad_tipo.getMultiplicador();
        System.out.println("Puntuación obtenida: " + puntu);
        System.out.println("Puntuación final: " + puntuacion_final);

    }
}
