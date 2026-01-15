package org.example;

public class bocadillo {

    private String nombre;
    private String pan;
    private String ingrediente;
    private String salsa;
    private double precio;

    public bocadillo(String nombre, String pan, String ingrediente, String salsa, double precio) {

        this.nombre = nombre;
        this.pan = pan;
        this.ingrediente = ingrediente;
        this.salsa = salsa;
        this.precio = precio;

    }

    public bocadillo() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getPan() {
        return pan;
    }

    public void setPan (String pan) {
        this.pan = pan;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente (String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa (String salsa) {
        this.salsa = salsa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    public void ImprimirInfoBocata() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de pan: " + pan);
        System.out.println("Ingrediente: " + ingrediente);
        System.out.println("Salsa: " + salsa);
        System.out.println("Precio a pagar: " + precio);

    }

}
