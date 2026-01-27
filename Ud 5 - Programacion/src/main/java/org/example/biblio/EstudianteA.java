package org.example.biblio;

public class EstudianteA {

    public static void main(String[] args) {
        Estudiante jorge = new Estudiante("jorge", "1DAM", "jorge@iesmutxamel.com");

        System.out.println(jorge);
        editorial millenium = new editorial("millenium", "España");

        libro divina = new libro("Divina Comedia", "Dante Alighieri", millenium);
        System.out.println(divina);

        Prestamo p1 = divina.prestar(jorge);

        System.out.println(p1.getEstudiante());
        System.out.println(p1.getFecha());
    }


}
