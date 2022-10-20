package com.pruebaCSV;

import com.opencsv.CSVReader;
import java.io.FileReader;

/*
    Esta clase se encarga de leer el csv, no devuelve nada solo muestra el contenido
 */
public class LectorCSV {

    public void leerCSV (String nombreArchivo){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;

            while ((fila = csvReader.readNext()) != null){
                int i = 0;
                System.out.println(fila[i] + " | "
                        + fila[1] + " | "
                        + fila[2] + " | ");

            }

            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
