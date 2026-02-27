package org.example.exath;

import java.util.ArrayList;
import java.util.Scanner;

public class Agente extends Persona implements AccionesPoliciales{
    static Scanner entrada = new Scanner(System.in);
    private Integer  ids = 1;
    private int id;



    private int codigo_aceso;
    private ArrayList<Integer> listaId;


    public Agente(String nombre, String poblacion,int codigo_aceso) {
        super(nombre, poblacion);

        this.id=ids;
        this.codigo_aceso=codigo_aceso;
        ids++;


    }



    public Agente (int id, int codigo_aceso){
        super(null,null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_aceso() {
        return codigo_aceso;
    }

    public void setCodigo_aceso(int codigo_aceso) {
        this.codigo_aceso = codigo_aceso;
    }



    public  boolean login(Agente a){
        System.out.println("Bienvenido " + a.getNombre());



        return false;
    }

    @Override
    public void mostrarTipoPersona() {
        System.out.println("Autoridad");
    }

    @Override
    public Ciudadano solicitarDatosCiudadano() {
        System.out.println("Creando expediente...");
        System.out.println("Introduce los datos del Ciudadano a registrar");
        System.out.println("Nombre:");
        String nom = entrada.nextLine();
        System.out.println("Poblacion:");
        String pob = entrada.nextLine();
        System.out.println("DNI:");
        String DNI = entrada.nextLine();

        Ciudadano ciu = new Ciudadano(nom,pob,DNI);

        return ciu;
    }

    @Override
    public Expediente crearExpediente() {

        Expediente exp = new Expediente(solicitarDatosCiudadano(),EstadoTramite.INICIADO);

        return exp;
    }

    @Override
    public void siguienteEstado(Expediente expediente) {

        if (expediente.getEstadoTramite().equals(EstadoTramite.INICIADO)) {
            System.out.println("Agente modificando estado: INICAIDO a COMPLETADO");
            expediente.setEstadoTramite(EstadoTramite.COMPLETADO);
        }
    }

    @Override
    public void archivarExpediente(Expediente expediente) {

        try{
            if (!expediente.getEstadoTramite().equals(EstadoTramite.PAGADO)){
                throw new NoPagadoException();
            }else{
                expediente.setEstadoTramite(EstadoTramite.ARCHIVADO);
                System.out.println("Expediente archivado...");
            }

        } catch (NoPagadoException e) {
            System.out.println(e.getMessage());
        }

    }
}
