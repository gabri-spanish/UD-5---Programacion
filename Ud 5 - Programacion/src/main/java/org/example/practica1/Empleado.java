package org.example.practica1;

import java.util.ArrayList;
    public class Empleado {



    private String id;
    private String nombre;
    private String cargo;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado empleado;

        public Empleado(String id, String nombre, String cargo, int temporadas, ArrayList<Empleado> listaEmpleados, ArrayList<Invitado> listaInvitados, Empleado empleado) {
            this.id = id;
            this.nombre = nombre;
            this.cargo = cargo;
            this.temporadas = temporadas;
            this.listaEmpleados = listaEmpleados;
            this.listaInvitados = listaInvitados;
            this.empleado = empleado;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public int getTemporadas() {
            return temporadas;
        }

        public void setTemporadas(int temporadas) {
            this.temporadas = temporadas;
        }

        public ArrayList<Empleado> getListaEmpleados() {
            return listaEmpleados;
        }

        public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
            this.listaEmpleados = listaEmpleados;
        }

        public ArrayList<Invitado> getListaInvitados() {
            return listaInvitados;
        }

        public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
            this.listaInvitados = listaInvitados;
        }

        public Empleado getEmpleado() {
            return empleado;
        }

        public void setEmpleado(Empleado empleado) {
            this.empleado = empleado;
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "id='" + id + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", cargo='" + cargo + '\'' +
                    ", temporadas=" + temporadas +
                    ", listaEmpleados=" + listaEmpleados +
                    ", listaInvitados=" + listaInvitados +
                    ", empleado=" + empleado +
                    '}';
        }
}
