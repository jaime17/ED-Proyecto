/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jaime Ontiverps
 */
public class Cine {
     protected ArrayList<Sala> salas= new ArrayList<Sala>();

    void relacion(){
        for (Sala sala: salas) {
            System.out.println("La película mas vista en la sala "+ sala.getNumero() + " es \""+ sala.masVistas() + "\" con "+sala.getAsistencia()+" visitas.");

        }
}
     void cartelera(){
        Scanner entrada = new Scanner(System.in);
        for(int j = 0; j<7; j++) salas.add(new Sala(j + 1));
        for(int i = 0; i<15; i++){
           System.out.println("Ingrese el nombre de la película.");
           String movie = entrada.next();
            for(int j = 0; j<7; j++) {
                salas.get(j).addPeli(movie);
                int p = salas.get(j).buscar(movie);
                salas.get(j).Peliculas.get(p).setVisitas((int)(Math.random()*100)+1);
            }
        }
    }
}



