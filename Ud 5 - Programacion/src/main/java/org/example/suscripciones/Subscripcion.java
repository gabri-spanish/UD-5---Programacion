package org.example.suscripciones;

public abstract class Subscripcion {


    private String nombrePlan;
    private double precio;

    public Subscripcion(String nombrePlan, double precio) {

        this.nombrePlan = nombrePlan;
        this.precio = precio;

    }

    public void mostrarInfo() {
        System.out.println("Nombre del plan " + nombrePlan);
        System.out.println("Precio total " + precio);
    }

    public abstract String obtenerBeneficios();

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Subscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }

}
