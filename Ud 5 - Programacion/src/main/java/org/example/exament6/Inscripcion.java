package org.example.exament6;

import java.util.Scanner;

public class Inscripcion {

    private Piloto piloto;
    private CategoriaDrift categoria;
    private boolean pagado;

    Scanner teclado = new Scanner(System.in);

    public Inscripcion(Piloto piloto, CategoriaDrift categoria, boolean pagado) {
        System.out.println("Piloto " + piloto + " realizando inscripción...");
        System.out.println("Elige una categoría [STREET, PRO, HYPER_DRIFT]:");
        categoria = CategoriaDrift.valueOf(teclado.nextLine());
        System.out.println("Piloto " + piloto + " inscrito en PRO. Pendiente de pago " + categoria.getPago());
        pagado = false;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public CategoriaDrift getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDrift categoria) {
        this.categoria = categoria;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setEstadoCoche(EstadoCoche estadoCoche) {
        if (estadoCoche == EstadoCoche.PENDIENTE) {
            System.out.println("El coche está en estado pendiente");
            setEstadoCoche(EstadoCoche.PENDIENTE);
        } else if (estadoCoche == EstadoCoche.REVISADO) {

        }
    }
}
