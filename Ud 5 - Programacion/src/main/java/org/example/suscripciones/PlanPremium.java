package org.example.suscripciones;

public class PlanPremium extends Subscripcion{

    public PlanPremium(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public String obtenerBeneficios() {
        return "Acceso a todo el contenido en alta definición y descargas offline.";
    }




}
