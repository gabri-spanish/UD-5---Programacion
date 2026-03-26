package org.example.Tema8;

public class Programa {
    static void main(String[] args) {
        Prueba prueba = new Prueba() {
            @Override
            public String aprobar(int nota) {
                System.out.println("Aprobando programación desde una anónima con un " + nota);
                if (nota >= 5) {
                    return "aprobado";
                } else {
                    return "al miércoles";
                }
            }
        };

        Prueba lamda = (int nota) -> {
            System.out.println("Aprobando programación desde una lamda con un " + nota);
            if (nota >= 5) {
                return "aprobado";
            } else {
                return "al miércoles";
            }
        };

        System.out.println(prueba.aprobar(4));
        System.out.println(lamda.aprobar(10));
    }
}
