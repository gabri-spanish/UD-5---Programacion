package org.example.ejerciciosArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class listaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Está la lista de la compra vacía?: " + listaCompra.isEmpty());

        listaCompra.add("pan");

        System.out.println("Está la lista de la compra vacía?: " + listaCompra.isEmpty());

        listaCompra.addAll(Arrays.asList("agua", "gambas", "lechugas", "tomates", "carne picada"));

        System.out.println("Producto en la tercera posición: " + listaCompra.get(2));

        listaCompra.set(1,"queso");

        System.out.println("Tiene la lista leche?: " + listaCompra.contains("leche"));

        System.out.println("Introduce un elemento");
        String elemento = teclado.next();
        if(comprobarElemento(elemento, listaCompra) == -1) {
            listaCompra.add(elemento);
        } else {
            System.out.println("El elemento ya existe");
        }

        System.out.println(listaCompra);

        System.out.println("Elementos en la lista: " + listaCompra.size());

        ArrayList<String> listaCopia = new ArrayList<>(listaCompra);

        listaCopia.clear();
        System.out.println("Lista de la compra vacía?: " + listaCopia.isEmpty());

        boolean sonIguales = listaCompra.equals(listaCopia);

        System.out.println("Son iguales?: " + sonIguales);

        listaCopia.addAll(Arrays.asList("pan", "lechugas"));

        ArrayList<String> faltantes = new ArrayList<>(listaCompra);
        faltantes.removeAll(listaCopia);
        System.out.println("Elementos que faltan: " + faltantes);

        System.out.println("Elementos en la lista: " + listaCompra.size());

        ArrayList<Integer> preciosCompra = new ArrayList<>(listaCompra.size());
        preciosCompra.addAll(Arrays.asList(1,3,10,7,5,15));

        System.out.println(listaCompra);
        System.out.println(preciosCompra);

    }

    public static int comprobarElemento (String palabra, ArrayList<String> copia) {
        return copia.indexOf(palabra);
    }

}
