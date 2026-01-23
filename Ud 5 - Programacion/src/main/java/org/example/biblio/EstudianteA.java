package org.example.biblio;

public class EstudianteA {

    public static void main(String[] args) {
        Estudiante jorge = new Estudiante("jorge", "1DAM", "jorge@iesmutxamel.com");

        System.out.println(jorge);
        editorial millenium = new editorial("millenium", "España");

        libro divina = new libro("Divina Comedia", "Dante Alighieri", millenium);
        System.out.println(divina);

        divina.prestar(jorge);
    }


}
