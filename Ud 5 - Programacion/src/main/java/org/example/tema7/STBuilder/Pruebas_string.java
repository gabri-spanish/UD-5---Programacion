package org.example.tema7.STBuilder;

public class Pruebas_string {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Calleu");
        sb.append("Mantecao ").append(" Joaquín!!").append(" adiós");

        System.out.println(sb);

        sb.insert(16, " de limón");

        System.out.println(sb);
        sb.replace(26, 35, "Jacobo");

        System.out.println(sb);

        sb.delete(26,32);
        System.out.println(sb);
        System.out.printf(" %d ", 83);
    }
}
