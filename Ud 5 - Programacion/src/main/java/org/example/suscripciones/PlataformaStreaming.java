package org.example.suscripciones;

import java.util.ArrayList;

public class PlataformaStreaming {
    public static void main(String[] args) {

        ArrayList<Subscripcion>listaSuscripciones=new ArrayList<>();

        PlanGratis gratis = new PlanGratis("Gratis", 0);
        listaSuscripciones.add(gratis);

        PlanFamiliar familiar = new PlanFamiliar("Plan familiar", 0);
        listaSuscripciones.add(familiar);


    }
}
