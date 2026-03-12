package org.example.tema7.mapas;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Diccionario {

    private HashMap<String, String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void nuevoPar(String esp, String eng) {
        diccionario.put(esp, eng);
    }

    public String traduce(String esp) {
        return diccionario.get(esp);
    }

    public String palabraAleatoria() {
        Set<String> claves = diccionario.keySet();
        int pos = new Random().nextInt(claves.size());
        return claves.toArray(new String[0])[pos];
    }

    public String primeraLetraTraduccion(String esp) {
        String traduccion = diccionario.get(esp);
        if (traduccion != null && traduccion.length() > 0) {
            return traduccion.substring(0, 1);
        }
        return "";
    }
}

