/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jaime Ontiverps
 */
public class Sala {
     protected ArrayList<Peliculas> Peliculas = new ArrayList<Peliculas>();
    protected int numero;

    public Sala(int numero) {
        this.numero = numero;
    }

    int buscar(String name) {
        for(int i=0;i<Peliculas.size();i++){
            if(Peliculas.get(i).getNombre()==name)return i; 
        }
        return -1; 
    }

    public int getNumero() {
        return numero;
    }

    String masVistas(){
        Collections.sort(Peliculas);
        return Peliculas.get(0).getNombre();
    }
    int getAsistencia(){
        return Peliculas.get(0).getVisitas();
    }
    void addPeli(String movie){Peliculas.add(new Peliculas(movie));
}
}
