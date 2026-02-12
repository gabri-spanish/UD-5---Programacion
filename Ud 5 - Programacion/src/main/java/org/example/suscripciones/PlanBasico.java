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
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("30 días de prueba gratuita");
    }
}
