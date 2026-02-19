package org.example.excepciones;

import com.sun.jdi.VMCannotBeModifiedException;
import java.util.zip.DataFormatException;

public class excepciones {
    public static void main(String[] args) throws Exception {

     int edad = 15;

     if (edad < 18 ) {

         throw new EdadValida();
     }

    }
}
