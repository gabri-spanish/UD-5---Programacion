package org.example.practica1t6;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago {

    Scanner teclado = new Scanner(System.in);
    private final String TELEFONO="\\d{9}";
    Random PIN = new Random(999999);
    private String telefono;
    private int pin;



    public void validarBizum() {


        System.out.println("Introduce tu teléfono");
        telefono = teclado.nextLine();
        validar:
        if (!telefono.matches(TELEFONO)) {
            System.out.println("Formato de teléfono incorrecto, introduce el correcto, por favor");
            break validar;
        } else {

        System.out.println("[CHIVATO PIN] " + PIN);
        System.out.println("Introduce tu pin");
        pin = teclado.nextInt();

            if (pin != PIN) {
                System.out.println("PIN INCORRECTO");
                break validar;
            } else {
                System.out.println("Validando Bizum...");
                System.out.println("Introduce el importe a pagar ");
            }

            }

    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
    }


}
