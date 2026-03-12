package org.example.tema7.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Map<String, Integer> temperaturas = new HashMap<>();

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        String opcion;

            do {
                System.out.print("Elige una opción [insertar, actualizar, consultar, ver todas, salir]: ");
                opcion = teclado.nextLine().toLowerCase();

                switch (opcion) {

                    case "insertar":
                        System.out.print("Introduce los nuevos datos (ciudad-temperatura): ");
                        String entrada = teclado.nextLine();
                        String[] partes = entrada.split("-");
                        if (partes.length == 2) {
                            String ciudad = partes[0];
                            try {
                                int temp = Integer.parseInt(partes[1]);
                                temperaturas.put(ciudad, temp);
                            } catch (NumberFormatException e) {
                                System.out.println("Temperatura no válida.");
                            }
                        } else {
                            System.out.println("Formato incorrecto. Usa ciudad-temperatura.");
                        }
                        break;

                    case "actualizar":
                        System.out.print("Introduce la ciudad a actualizar: ");
                        String ciudadAct = teclado.nextLine();
                        if (temperaturas.containsKey(ciudadAct)) {
                            System.out.print("Nueva temperatura: ");
                            try {
                                int nuevaTemp = Integer.parseInt(teclado.nextLine());
                                temperaturas.put(ciudadAct, nuevaTemp);
                            } catch (NumberFormatException e) {
                                System.out.println("Temperatura no válida.");
                            }
                        } else {
                            System.out.println("La ciudad no existe en el registro.");
                        }
                        break;

                    case "consultar":
                        System.out.print("Introduce la ciudad a consultar: ");
                        String ciudadCons = teclado.nextLine();
                        if (temperaturas.containsKey(ciudadCons)) {
                            System.out.println("Temperatura en " + ciudadCons + ": " + temperaturas.get(ciudadCons) + "º");
                        } else {
                            System.out.println("La ciudad de " + ciudadCons + " no tiene temperaturas registradas.");
                        }
                        break;

                    case "ver todas":
                        System.out.println("Registro de temperaturas:");
                        for (String ciudades : temperaturas.keySet()) {
                            System.out.println(ciudades + ": " + temperaturas.get(ciudades) + "º");
                        }
                        break;

                    case "salir":
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } while (!opcion.equals("salir"));
    }
}
