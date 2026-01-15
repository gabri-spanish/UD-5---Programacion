package org.example;

public class personaMain {
    public static void main(String[] args) {

        persona persona1 = new persona("Jacobo", "324223341j", 25);
        persona persona2 = new persona("Christian", "32424211j", 50);
        persona1.getNombre();
        persona1.getDNI();
        persona1.getEdad();

        persona2.getNombre();
        persona2.getDNI();
        persona2.getEdad();

        persona1.ImprimirInfoPersona();
        persona2.ImprimirInfoPersona();

    }
}
