package org.example.interfaces.ejercicios;

import java.util.ArrayList;

public class DispositivosApp {
    public static void main(String[] args) {

        Dispositivo microondas = new Dispositivo("Microondas Balay") {
            @Override
            public void encender() {
                super.encender();
            }
        };

        Dispositivo horno = new Dispositivo("Horno inteligente") {
            @Override
            public void encender() {
                super.encender();
            }
        };
        Televisor LGTV = new Televisor("LGTV");
        ParlanteInteligente Alexa = new ParlanteInteligente("Alexa");

        ArrayList<Dispositivo> listaDespositivos = new ArrayList<>();
        listaDespositivos.add(LGTV);
        listaDespositivos.add(Alexa);
        listaDespositivos.add(microondas);
        listaDespositivos.add(horno);


    }
}
