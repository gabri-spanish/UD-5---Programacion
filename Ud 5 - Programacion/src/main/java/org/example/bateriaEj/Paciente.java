package org.example.bateriaEj;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class Paciente {

    private static final char DEF_GENERO = 'X';
    private static final int DEF_INFRAPESO = -1;
    private static final int DEF_PESOIDEAL = 0;
    private static final int DEF_SOBREPESO = 1;
    static Random aleatorio = new Random();
    private String nombre;
    private int edad;
    private String DNI;
    private char genero;
    private double peso;
    private int altura;

    public Paciente (String nombre, int edad, char genero, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        DNI = generarDNI();
    }

    public Paciente() {
        this(null, 0, DEF_GENERO, 0, 0);
    }

    public char letraDNI() {

        int DNInum = parseInt(DNI);
        int res = (DNInum / 23);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[res];
    }

    public String getDNI() {
        return DNI;
    }

    public String generarDNI() {

        String DNI = "";

        for (int i = 0; i<8; i++) {
            int num = aleatorio.nextInt(10);
            DNI = DNI + num;
        }

        return DNI+letraDNI();
    }

    public int calcularIMC() {

        double resultado = peso/Math.pow((double) altura/100,2);

        System.out.println(resultado);

        if (resultado < 20) {
            return DEF_INFRAPESO;
        } else if (resultado > 25) {
            return DEF_PESOIDEAL;
        } else {
            return DEF_SOBREPESO;
        }
    }

    public char validarGenero (char genero) {

        if (genero == 'H' || genero == 'M') {
            return genero;
        } else {
            return DEF_GENERO;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override

    public String toString() {
        return "Pacioente [nombre = " + nombre + " edad = " + edad + " DNI = " + DNI + " genero = " + genero + " peso = " + peso + " altura = " + altura + "]";
    }

}
