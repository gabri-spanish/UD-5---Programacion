package org.example.biblio;

public class Estudiante {

    private static int contadorEstudiantes = 0;
    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;



    private libro libro;

    public Estudiante (String nombre, String curso, String email)  {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        nia = ++contadorEstudiantes;
        libro = null;
    }

    public Estudiante (String nombre) {
        this(nombre,"","");
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String correo) {
        if (correo.matches(CORREO_FORMAT)) {
            return true;
        } else {
            return false;
        }
    }

    public libro getLibro() {
        return libro;
    }

    public void setLibro(libro libro) {
        this.libro = libro;
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

    private void setNia(int nia) {
        this.nia = nia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                ", libro=" + libro +
                '}';
    }

}
