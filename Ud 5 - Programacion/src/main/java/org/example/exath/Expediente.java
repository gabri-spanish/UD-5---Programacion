package org.example.exath;

import java.util.ArrayList;
import java.util.Scanner;

public class Expediente {
    static Scanner entrada = new Scanner(System.in);

    private Ciudadano ciudadano;



    private ArrayList<TipoSer> listasSeres;
    private EstadoTramite estado;

    public Expediente(Ciudadano ciudano,EstadoTramite estado){

        this.ciudadano = ciudano;
        this.estado = estado;
        this.listasSeres = new ArrayList<>();

    }



    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public ArrayList<TipoSer> getListasSeres() {
        return listasSeres;
    }

    public void setListasSeres(ArrayList<TipoSer> listasSeres) {
        this.listasSeres = listasSeres;
    }

    public EstadoTramite getEstadoTramite() {
        return estado;
    }

    public void setEstadoTramite(EstadoTramite estado) {
        this.estado = estado;
    }

    public void insertarSeres() {

        boolean estado = true;

        System.out.println("Insertar el tipo de ser que quieres censar [THERIAN,DOMESTICO,EXOTICO]");
        String ser = entrada.nextLine();


        switch (TipoSer.valueOf(ser.toUpperCase())) {
            case TipoSer.THERIAN:
                listasSeres.add(TipoSer.THERIAN);
                break;
            case TipoSer.DOMESTICO:
                listasSeres.add(TipoSer.DOMESTICO);

                break;
            case TipoSer.EXOTICO:
                listasSeres.add(TipoSer.EXOTICO);

                break;
            default:
                System.out.println("Tipo no contemplado:");
                estado= false;
        }
        if (estado){
            verTasa();
        }
        boolean estado2 = true;

        while (estado2){
            System.out.println("¿Quieres añadir otro tipo de ser?[S/N]");
            String res = entrada.nextLine();

            if (res.toUpperCase().equals("S")){
                System.out.println("Insertar el tipo de ser que quieres censar [THERIAN,DOMESTICO,EXOTICO]");
                String ser2 = entrada.nextLine();


                switch (TipoSer.valueOf(ser2)) {
                    case TipoSer.THERIAN:
                        listasSeres.add(TipoSer.THERIAN);

                        break;
                    case TipoSer.DOMESTICO:
                        listasSeres.add(TipoSer.DOMESTICO);

                        break;
                    case TipoSer.EXOTICO:
                        listasSeres.add(TipoSer.EXOTICO);

                        break;
                    default:
                        System.out.println("Tipo no contemplado:");
                        estado= false;
                }
                if (estado){
                    verTasa();
                }
            } else if (res.toUpperCase().equals("N")) {
                estado2 = false;
            }

        }


    }
    public void verTasa(){

        double total = 0;

        for (TipoSer s : listasSeres){

            total += s.getComision();


        }


        System.out.println("Importe tasas actual: " + total + "€ ");

    }
    @Override
    public String toString() {
        return "Expediente{" +
                "ciudadano=" + ciudadano +
                ", listasSeres=" + listasSeres +
                ", estado=" + estado +
                '}';
    }


}
