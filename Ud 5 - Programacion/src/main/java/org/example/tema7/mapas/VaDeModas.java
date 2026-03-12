package org.example.tema7.mapas;

import java.util.HashMap;

public class VaDeModas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int valores = in.nextInt();
        in.nextLine();
        if (valores==0)
            return false;
        else {

            HashMap<Integer,Integer> mapita = new HashMap<>();

            int max = 0;

            for (int i = 0; i < valores; i++) {
                int num = in.nextInt();

                if (mapita.containsKey(num)){
                    mapita.put(num,mapita.get(num)+1);
                }else{
                    mapita.put(num,1);
                }
               // mapita.put(num, mapita.getOrDefault(num,0)+1);

                if (i==0 || mapita.get(max) < mapita.get(num)){
                    max = num;
                }
            }

            System.out.println(max);

            in.nextLine();
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
