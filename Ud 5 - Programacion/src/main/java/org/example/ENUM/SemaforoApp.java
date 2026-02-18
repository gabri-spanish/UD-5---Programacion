package org.example.ENUM;

public class SemaforoApp {
    public static void main(String[] args) {

    Semaforo sema = Semaforo.ROJO;

    for (int i = 0; i < 10; i++) {
        System.out.println(sema);
        sema = sema.siguiente();
    }

    }
}
