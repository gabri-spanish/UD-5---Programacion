package org.example.practica1t6;

import java.util.ArrayList;

public class TarjetaCredito extends MetodoPago {

    private final String FORMATO_TARJETA="\\d{16}";
    private String nro_tarjeta;
    private ArrayList<String>tipos;

    public void validarTarjeta() {
        if (!nro_tarjeta.matches(FORMATO_TARJETA)) {
            System.out.println("");
            return;
        } else {

        }
    }

    @Override
    public void procesarPago(double importe) {

        System.out.println("Procesando pago de " + importe + " con tarjeta " + tipos);

    }
}
