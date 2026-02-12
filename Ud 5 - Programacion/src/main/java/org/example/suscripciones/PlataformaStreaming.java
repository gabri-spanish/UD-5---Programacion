package org.example.suscripciones;

import java.util.ArrayList;

public class PlataformaStreaming {
    public static void main(String[] args) {

        ArrayList<Subscripcion>listaSuscripciones=new ArrayList<>();

        PlanGratis gratis = new PlanGratis("Gratis", 0);
        listaSuscripciones.add(gratis);

        PlanBasico basico = new PlanBasico("Basico", 9.99);
        listaSuscripciones.add(basico);

        PlanPremium premium = new PlanPremium("Premium", 14.99);
        listaSuscripciones.add(premium);

        PlanFamiliar familiar = new PlanFamiliar("Familiar", 19.99);
        listaSuscripciones.add(familiar);

        for (Subscripcion subscripcion : listaSuscripciones) {
            subscripcion.mostrarInfo();
            subscripcion.obtenerBeneficios();
        }


    }
}
