package org.example;

public class Estudiante {

    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante (String nombre, String curso, String email)  {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        nia = contadorEstudiantes + 1;
    }

    public Estudiante (String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
