package org.example.suscripciones;

public class PlanFamiliar extends Subscripcion{

    public PlanFamiliar(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public String obtenerBeneficios() {
        return "Acceso para varios perfiles simultáneamente en alta definición.";
    }

}
