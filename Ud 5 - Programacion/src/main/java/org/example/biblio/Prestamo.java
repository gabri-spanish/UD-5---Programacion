package org.example.biblio;

import java.time.LocalDateTime;

public class Prestamo {

    private libro libro;
    private Estudiante estudiante;
    private LocalDateTime fecha;

    public Prestamo(libro libro, Estudiante estudiante) {

        fecha = LocalDateTime.now();
        this.libro = libro;
        this.estudiante = estudiante;

    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public libro getLibro() {
        return libro;
    }

    public void setLibro(libro libro) {
        this.libro = libro;
    }


}
