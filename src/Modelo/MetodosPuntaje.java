/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Erika
 */
public class MetodosPuntaje {
    
    private ArrayList <PuntajeMayor> arrayPuntaje;
    ArchivoPuntaje archivoPuntaje;
    private String nombre = "";
    private int puntaje=0;
    
    //Metodo constructor de la clase
    public MetodosPuntaje()
    {
        arrayPuntaje=new ArrayList <PuntajeMayor>();
        archivoPuntaje = new ArchivoPuntaje();

        cargarArchivoAlArray();
    }//Fin del metodo constructor
    
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
    
    
  //Metodo que escribe la informacion en el array  
  public void escribirInformacion() 
  {
        archivoPuntaje.crearArchivo();
        for (int contador = 0; contador < arrayPuntaje.size(); contador++) 
        {
            archivoPuntaje.ingresarInformacionPuntaje(arrayPuntaje.get(contador));
        }
        System.out.println("se envió a escribir la informacion al archivo.");
    }
  
  //Metodo que carga el archivo al array de los puntajes
  public void cargarArchivoAlArray() 
 {
        PuntajeMayor arregloPuntaje[] = archivoPuntaje.devolverInformacionDelArchivo();
        for (int contador = 0; contador < arregloPuntaje.length; contador++) 
        {
            arrayPuntaje.add((PuntajeMayor) arregloPuntaje[contador]);
            setNombre(arrayPuntaje.get(contador).getNombre());
            setPuntaje(arrayPuntaje.get(contador).getPuntaje());

            System.out.println("se agregó un objeto del archivo al array.");
        }

   }//Fin de cargarArchivoAlArray
      
  //Metodo que devuelve los puntos en el arreglo 
  public String[] devolverPuntosEnArreglo() 
  {
        String arregloPuntaje[] = new String[arrayPuntaje.size()];
        for (int contador = 0; contador < arrayPuntaje.size(); contador++) {
            arregloPuntaje[contador] = arrayPuntaje.get(contador).getNombre();
        }

        return arregloPuntaje;
    }//Fin del metodo deviolverPuntosEnArreglo

  //Metodo que registra el puntajeMayor  
   public void registrarPuntajeMayor(String nombre, int puntaje) 
    {
        arrayPuntaje.add(new PuntajeMayor(nombre, puntaje));
    }//Fin del metodo registrarPuntajeMayor

   //Metodo que buscar en el array el nombre y el puntaje 
   public void buscar() 
    {

        for (int contador = 0; contador < arrayPuntaje.size(); contador++) {
            setNombre(arrayPuntaje.get(contador).getNombre());
            setPuntaje(arrayPuntaje.get(contador).getPuntaje());
        }
    }//Fin del metodo buscar
}//Fin de la clase
   
