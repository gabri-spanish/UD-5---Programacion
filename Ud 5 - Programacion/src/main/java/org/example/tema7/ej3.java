package org.example.tema7;

import java.util.LinkedList;
import java.util.Queue;
public class ej3 {
    public static void main(String[] args) {


                Queue<String> playlist = new LinkedList<>();

                playlist.add("Mili - Through Patches of Violet");
                playlist.add("Alexandros - Koeru");
                playlist.add("Tetsuro Oda - DAN DAN Kokoro Hikareteku");
                playlist.add("Edass - Eterna");
                playlist.add("Queen - Bohemian Rhapsody");

                System.out.println("Playlist inicial:");
                mostrarPlaylist(playlist);

                while (!playlist.isEmpty()) {
                    System.out.println("--------------------------------------");
                    System.out.println("Playlist antes de reproducir:");
                    mostrarPlaylist(playlist);

                    String cancionActual = playlist.poll();
                    System.out.println("Reproduciendo: " + cancionActual);

                    System.out.println("Playlist después de reproducir:");
                    mostrarPlaylist(playlist);
                }

                System.out.println("Todas las canciones han sido reproducidas.");
            }

            public static void mostrarPlaylist(Queue<String> playlist) {
                if (playlist.isEmpty()) {
                    System.out.println("[La playlist está vacía]");
                } else {
                    System.out.println(playlist);
                }

    }
}


