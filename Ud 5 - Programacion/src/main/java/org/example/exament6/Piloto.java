package org.example.exament6;

import org.example.exath.EstadoTramite;

import java.util.Scanner;

public class Piloto extends Participante {

    private String marca;
    private EstadoCoche estado;
    private int puntuacion;

    Scanner teclado = new Scanner(System.in);

    public Piloto(String marca) {
        super(null, null);
        this.marca = marca;

    }

    public Inscripcion inscribirse() {
        boolean estado = false;
        CategoriaDrift categoria;
        do {
            System.out.println("Inscribiendo participante...");
            System.out.println("Nombre:");
            setNombre();
            System.out.println("País:");
            setPais();
            System.out.println("Piloto " + getNombre() + " de la marca " + marca + " creado.");
        } while (!estado);
        return null;
    }

    public void pagarInscripcion(Inscripcion inscripcion) {
        System.out.println("Piloto " + Participante.getNombre() + " abonando pago de su inscripción...");
        inscripcion.setPagado(inscribirse().isPagado());
        System.out.println("Pagado");
    }

}
