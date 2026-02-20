package org.example.Practica2;

import static org.example.Practica2.Equipos.JUVENIL;
import static org.example.Practica2.Equipos.SENIOR;
import static org.example.Practica2.Posiciones.DELANTERO;
import static org.example.Practica2.Posiciones.PORTERO;

public class OrihuelaCFApp {
    public static void main(String[] args) {

        Entrenador Gabriel = new Entrenador("Gabriel Tortosa", 19, SENIOR, "4-3-3");
        Jugador Sánchez = new Jugador("Ángel Sánchez", 28, SENIOR, 12, DELANTERO);
        Jugador Moreno = new Jugador("Eloy Moreno", 20, JUVENIL, 25, PORTERO);

    }
}
