package org.example.practica1t6;

public class PayPal extends MetodoPago {

    private String cuenta;
    private double saldo;

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
    }
}
