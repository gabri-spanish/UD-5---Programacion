package org.example.exament6;

import java.util.ArrayList;

public class DriftSpainSeriesApp {
    public static ArrayList<Inscripcion> pilotosInscritos = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO A LA APP DEL DRIFT SPAIN SERIES DE VALENCIA ===");
        Piloto skoda = new Piloto("SKODA");
        Piloto mercedes = new Piloto("MERCEDES");
        Piloto TOYOTA = new Piloto("TOYOTA");
        Inscripcion skoda_insc = skoda.inscribirse();

    }
}
