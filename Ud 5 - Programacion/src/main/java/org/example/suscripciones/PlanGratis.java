package org.example.suscripciones;

public class PlanGratis extends Subscripcion {

    public PlanGratis(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public String obtenerBeneficios() {
        return "Acceso limitado con anuncios";
    }
}
