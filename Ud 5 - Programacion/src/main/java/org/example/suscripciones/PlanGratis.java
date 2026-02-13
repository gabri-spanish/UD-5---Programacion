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
    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Sin periodo de prueba");
        System.out.println();
    }
}
