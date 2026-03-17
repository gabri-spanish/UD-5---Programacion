package org.example.tema7.reservas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reservas {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha_hora;

    public Reservas(Usuario usuario, Pista pista, LocalDateTime fecha_hora) {
        this.usuario = usuario;
        this.pista = pista;
        this.fecha_hora = LocalDateTime.now();
    }

    public Reservas(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.pista = pista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservas reservas = (Reservas) o;
        return Objects.equals(pista, reservas.pista) && Objects.equals(fecha_hora, reservas.fecha_hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fecha_hora);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

}
