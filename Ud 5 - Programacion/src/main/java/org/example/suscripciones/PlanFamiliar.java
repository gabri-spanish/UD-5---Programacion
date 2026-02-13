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
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");

    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("7 días de prueba para cuentas nuevas");
        System.out.println();
    }

}
