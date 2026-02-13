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
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("14 días de prueba gratuita");
        System.out.println();
    }


}
