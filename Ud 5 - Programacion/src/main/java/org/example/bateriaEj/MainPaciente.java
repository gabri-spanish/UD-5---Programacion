package org.example.bateriaEj;

import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cómo se llama el paciente?");
        String nombre = teclado.next();

        System.out.println("Cuál es la edad del paciente");
        int edad = teclado.nextInt();

        System.out.println("Cuál es el género del paciente?");
        char genero = teclado.next().charAt(0);

        System.out.println("Cuál es la masa del paciente?");
        double peso = teclado.nextDouble();

        System.out.println("Cuál es la altura del paciente?");
        int altura = teclado.nextInt();

        Paciente objet1 = new Paciente(nombre, edad, genero, peso, altura);

       System.out.println();


    }

}
