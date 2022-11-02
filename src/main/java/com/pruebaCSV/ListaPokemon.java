package com.pruebaCSV;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ListaPokemon extends ArrayList<Pokemon> {


    // Sirve para almacenar los datos de los pokemons
    public ListaPokemon(String nombreArchivo){

        //Sirve para leer el archivo
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;

            //Sirve para leer cada linea del archivo
            while ((fila = csvReader.readNext()) != null){
                Pokemon miPokemon = new Pokemon(fila);
                this.add(miPokemon);
            }

            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
