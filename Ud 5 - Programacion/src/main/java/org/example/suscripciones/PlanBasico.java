package org.example.suscripciones;

public class PlanBasico extends Subscripcion {

    public PlanBasico(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public String obtenerBeneficios() {
        return "Acceso a todo el contenido en calidad estándar sin anuncios.";
    }

}
