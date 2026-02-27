package org.example.exath;

public class Ciudadano extends Persona{


    private String DNI;


    public Ciudadano(String nombre, String poblacion,String DNI) {
        super(nombre, poblacion);
        this.DNI=DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void abonarTasas(Expediente expediente){


        System.out.println("Ciudadano " + expediente.getCiudadano().getNombre() + " abonando tasas generadas en el expediente actual...");
        expediente.setEstadoTramite(EstadoTramite.PAGADO);
        System.out.println("Estado del expediente: " + expediente.getEstadoTramite());


    }

    @Override
    public void mostrarTipoPersona() {

        System.out.println("Civil");
    }
}
