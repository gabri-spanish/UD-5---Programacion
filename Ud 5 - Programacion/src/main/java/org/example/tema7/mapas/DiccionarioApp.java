package org.example.tema7.mapas;

import java.util.Scanner;

public class DiccionarioApp {
    public static void main(String[] args) {

        Diccionario dic = new Diccionario();

        dic.nuevoPar("perro", "dog");
        dic.nuevoPar("mesa", "table");
        dic.nuevoPar("coche", "car");
        dic.nuevoPar("gato", "cat");
        dic.nuevoPar("casa", "house");
        dic.nuevoPar("cumbre", "height");
        dic.nuevoPar("longitud", "length");
        dic.nuevoPar("pavo", "turkey");
        dic.nuevoPar("gallina", "hen");
        dic.nuevoPar("pollo", "chicken");
        dic.nuevoPar("gallo", "rooster");
        dic.nuevoPar("elefante", "elephant");
        dic.nuevoPar("judío", "jew");
        dic.nuevoPar("negro", "black");
        dic.nuevoPar("contener", "contain");
        dic.nuevoPar("ordenador", "computer");
        dic.nuevoPar("escuela", "school");
        dic.nuevoPar("langostino", "shrimp");
        dic.nuevoPar("hola", "hello");
        dic.nuevoPar("adiós", "goodbye");
        dic.nuevoPar("odiar", "hate");
        dic.nuevoPar("deber", "must");
        dic.nuevoPar("gritar", "scream");
        dic.nuevoPar("boca", "mouth");
        dic.nuevoPar("comedia", "comedy");
        dic.nuevoPar("crimen", "crime");
        dic.nuevoPar("castigo", "punishment");
        dic.nuevoPar("metamorfosis", "metamorphosis");
        dic.nuevoPar("día", "day");
        dic.nuevoPar("gustar", "like");
        dic.nuevoPar("comprar", "buy");
        dic.nuevoPar("vender", "sell");
        dic.nuevoPar("cucaracha", "cockroach");
        dic.nuevoPar("girafa", "giraffe");
        dic.nuevoPar("pájaro", "bird");
        dic.nuevoPar("problema", "problem");
        dic.nuevoPar("árbol", "tree");
        dic.nuevoPar("diablo", "devil");
        dic.nuevoPar("dios", "god");
        dic.nuevoPar("maestro", "master");
        dic.nuevoPar("profesor", "teacher");
        dic.nuevoPar("infierno", "hell");
        dic.nuevoPar("cielo", "sky");
        dic.nuevoPar("paraiso", "heaven");
        dic.nuevoPar("fuego", "fire");
        dic.nuevoPar("amor", "love");
        dic.nuevoPar("libro", "book");
        dic.nuevoPar("aliado", "ally");
        dic.nuevoPar("tiburón", "shark");
        dic.nuevoPar("ballena", "whale");
        dic.nuevoPar("existir", "exist");


        Scanner teclado = new Scanner(System.in);

        int totalPreguntas = 0;
        int aciertos = 0;

        while (true) {
            String palabra = dic.palabraAleatoria();
            String pista = dic.primeraLetraTraduccion(palabra);

            System.out.println(palabra.substring(0,1).toUpperCase() + palabra.substring(1) + ": " + pista + "…");
            System.out.print("Indique la respuesta: ");
            String respuesta = teclado.nextLine().trim().toLowerCase();

            if (respuesta.equals("fin")) {
                break;
            }

            totalPreguntas++;

            String correcta = dic.traduce(palabra);

            if (respuesta.equals(correcta)) {
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                System.out.println("¡NO! La respuesta correcta es " + correcta);
            }
        }

        int errores = totalPreguntas - aciertos;
        double porcentaje = totalPreguntas > 0 ? (aciertos * 100.0 / totalPreguntas) : 0;

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + totalPreguntas);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("Total errores: " + errores);
        System.out.println("Aciertos: " + (int) porcentaje + "%");
    }
}
