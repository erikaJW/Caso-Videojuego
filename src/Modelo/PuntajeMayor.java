/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Erika
 */
public class PuntajeMayor implements Serializable {
    
    private String nombre;
    private int puntaje;

    public PuntajeMayor(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

   
    
     public String getInformacion()
    {
        return  "Nombre: "+getNombre()+" PuntajeMayor: "+getPuntaje();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
