package org.example.exath;

import java.util.ArrayList;
import java.util.Scanner;

public class CensoMutxamelApp {

    static Scanner entrada = new Scanner(System.in);

    public static ArrayList<Agente> agentesPoliciasRegistrados = new ArrayList<>();
    public static ArrayList<Expediente> listaExpedientes = new ArrayList<>();

    static void main(String[] args) {

        agentesPoliciasRegistrados.add(new Agente("Luisa","Mutxamel",2334));
        agentesPoliciasRegistrados.add(new Agente("Raúl","Mutxamel",1234));

        System.out.println("Agente " + agentesPoliciasRegistrados.get(0).getNombre() + " tu id es: " + agentesPoliciasRegistrados.get(0).getId());
        System.out.println("Agente " + agentesPoliciasRegistrados.get(1).getNombre() + " tu id es: " + agentesPoliciasRegistrados.get(1).getId());

        menuCenso();

        for (Expediente e : listaExpedientes){

            e.toString();

        }

    }

    public  static void menuCenso() {

        boolean estado = false;

        System.out.println("=== BIENVENIDO A LA APPP DEL CENSO DE BESTIAS DE MUTXAMEL ===");
        System.out.println("Introduce tu ID: ");
        int id = entrada.nextInt();
        System.out.println("Introduce tu codigo de acceso: ");
        int cod = entrada.nextInt();
        for (Agente a :  agentesPoliciasRegistrados){
            if (a.getId() == id && a.getCodigo_aceso() == cod){

                a.login(a);
                estado = true;
                Expediente expediente = a.crearExpediente();
                listaExpedientes.add(expediente);
                expediente.insertarSeres();
                a.siguienteEstado(expediente);
                expediente.getCiudadano().abonarTasas(expediente);
                a.archivarExpediente(expediente);

            }
        }
        if (!estado){
            System.out.println("Datos introducidos no corresponden a ningun agente. Intentalo de nuevo.");
            menuCenso();
        }

    }

}
