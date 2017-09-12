/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Collections;

/**
 *
 * @author Jaime Ontiverps
 */
public class Peliculas<Pelicula> implements Comparable<Peliculas<Pelicula>> {
    protected String nombre;
    protected int visitas;

    public Peliculas(String nombre) {
        this.nombre = nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public int compareTo(Peliculas<Pelicula> p) {
        if(this.getVisitas()<p.getVisitas()){
            return 1;
        }
        if(this.getVisitas()>p.getVisitas()){
            return -1;
        }
        return 0;
    }
}