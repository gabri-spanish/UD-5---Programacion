package org.example.redsocial;

public class Persona {

    private String nombre;
    private int edad;
    private String nombreus;
    private int seguidores;

    public Persona(String nombre, int edad, String nombreus, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreus = nombreus;
        this.seguidores = seguidores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreus() {
        return nombreus;
    }

    public void setNombreus(String nombreus) {
        this.nombreus = nombreus;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void mostrarInfo() {
        System.out.println("Información del usuario: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: @" + nombre);
        System.out.println("Seguidores " + seguidores);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nombreus='" + nombreus + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }


}
