# Práctica 1. Practica de compra-venta de casas

![](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/media/18170915_111825-wabc-epstein-img.jpg)

## ÍNDICE
1. [Intro](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/practica1.md#1-intro#1-intro) 
2. [Estructura de clases](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/practica1.md#2-estructura-de-clases)
3. [Programa principal (InmoApp)](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/practica1.md#3-programa-principal-inmoapp)
4. [Pruebas](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/practica1.md#4-pruebas)
5. [Entrega](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/practica1.md#5-entrega)

### 1. Intro

### 2. Estructura de clases
![](https://github.com/gabri-spanish/UD-5---Programacion/blob/main/Ud%205%20-%20Programacion/src/main/java/org/example/inmobiliaria/media/biblio.png)

#### Codigo de plantuml
@startuml

package "org.example.biblio" {

    class Estudiante {
        - static int contadorEstudiantes
        - static final String CORREO_FORMAT
        - String nombre
        - String curso
        - int nia
        - String email
        - libro libro
        + Estudiante(String nombre, String curso, String email)
        + Estudiante(String nombre)
        + static int obtenerTotalEstudiantes()
        + static boolean validarCorreo(String correo)
        + String toString()
    }

    class editorial {
        - String nombre
        - String pais

        + editorial(String nombre, String pais)
        + String getNombre()
        + void setNombre(String nombre)
        + String getPais()
        + void setPais(String pais)
        + String toString()
    }

    class libro {
        - static int cantidadLibros
        - static int librosDisponibles
        - static final String CADENA_ID
        - static String id
        - static String titulo
        - static String autor
        - static boolean disponible
        - Estudiante estudiantePrestado
        - editorial editorial

        + libro(String cumbresBorrascosas, String emilyBronte, editorial editorial)
        - String generarID()
        + Prestamo prestar(Estudiante estudiante)
        + void devolver(Estudiante estudiante)
        + String toString()
    }

    class Prestamo {
        - libro libro
        - Estudiante estudiante
        - LocalDateTime fecha
        + Prestamo(libro libro, Estudiante estudiante)
        + LocalDateTime getFecha()
    }

    ' Relaciones
    Estudiante "1" -- "*" libro : >
    libro "1" -- "1" Estudiante : prestado a >
    libro "*" -- "1" editorial : pertenece a >
    Prestamo "1" o--> "1" libro
    Prestamo "1" o--> "1" Estudiante

}

@enduml


### 3. Programa principal (InmoApp)

### 4. Pruebas

### 5. Entrega
