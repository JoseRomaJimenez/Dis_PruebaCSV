package com.pruebaCSV;


/*
    Ejemplo muy sencillo de acceso a un archivo .csv desde java
 */

public class PruebaCSV {
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leerCSV("./datos/pokemon.csv");
    }
}
