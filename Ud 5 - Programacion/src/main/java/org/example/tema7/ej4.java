package org.example.tema7;

import java.util.Scanner;
import java.util.LinkedList;

public class ej4 {

    public static void main(String[] args) {

            LinkedList<String> listaCompra = new LinkedList<>();
            Scanner teclado = new Scanner(System.in);
            int opcion;

        do {
                System.out.println("--- LISTA DE LA COMPRA ---");
                System.out.println("1. Añadir producto al final");
                System.out.println("2. Eliminar primer producto");
                System.out.println("3. Eliminar producto por nombre");
                System.out.println("4. Ver primer producto");
                System.out.println("5. Mostrar lista actual");
                System.out.println("6. Buscar producto");
                System.out.println("0. Salir");
                System.out.print("Selecciona una opción: ");

                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.print("Introduce el nombre del producto: ");
                        String producto = teclado.nextLine();
                        listaCompra.offerLast(producto);
                        System.out.println("Producto añadido.");
                        break;

                    case 2:
                        if (listaCompra.isEmpty()) {
                            System.out.println("La lista está vacía. No se puede eliminar.");
                        } else {
                            String eliminado = listaCompra.pollFirst();
                            System.out.println("Producto eliminado: " + eliminado);
                        }
                        break;

                    case 3:
                        if (listaCompra.isEmpty()) {
                            System.out.println("La lista está vacía. No hay nada que eliminar.");
                        } else {
                            System.out.print("Introduce el nombre del producto a eliminar: ");
                            String prodEliminar = teclado.nextLine();

                            if (listaCompra.contains(prodEliminar)) {
                                listaCompra.remove(prodEliminar);
                                System.out.println("Producto eliminado.");
                            } else {
                                System.out.println("El producto no se encuentra en la lista.");
                            }
                        }
                        break;

                    case 4:
                        if (listaCompra.isEmpty()) {
                            System.out.println("La lista está vacía.");
                        } else {
                            System.out.println("Primer producto: " + listaCompra.peekFirst());
                        }
                        break;

                    case 5:
                        if (listaCompra.isEmpty()) {
                            System.out.println("La lista está vacía.");
                        } else {
                            System.out.println("--- Lista actual ---");
                            for (String prod : listaCompra) {
                                int posicion = listaCompra.indexOf(prod) + 1;
                                System.out.println(posicion + ". " + prod);
                            }
                        }
                        break;

                    case 6:
                        System.out.print("Introduce el producto a buscar: ");
                        String buscar = teclado.nextLine();

                        if (listaCompra.contains(buscar)) {
                            int pos = listaCompra.indexOf(buscar) + 1;
                            System.out.println("El producto está en la lista (posición " + pos + ").");
                        } else {
                            System.out.println("El producto NO está en la lista.");
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo de la aplicación...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

        } while (opcion != 0);
    }
}
