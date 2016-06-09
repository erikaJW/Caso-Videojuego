/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Erika
 */
public class ArchivoPuntaje {
    
    ObjectOutputStream archivoSalida;
    ObjectInputStream archivoEntrada;
    
    //Metodo constructor de la clase 
    public ArchivoPuntaje()
    {
       if(cargarArchivo())
       {
         System.out.println("El archivo Puntaje.dat se ha cargado exitosamente");  
       }
       else
       {
           crearArchivo();
           System.out.println("Error al cargar el archivo Puntaje.dat");
       }
    }//Fin del metodo constructor
     
    //Metodo que verifica mediante un boolean la existencia del archivo y lo carga. 
    public boolean cargarArchivo()
    {
     boolean existe=false;
     try
     {
       archivoEntrada= new ObjectInputStream( new FileInputStream ("Puntaje.dat"));
       existe=true;
     }
     catch(Exception e)
     {
      System.out.println(""+e);//especificar   
     }
        return existe;
    }//Fin del metodo cargarArchivo
     
    //Metodo para crear el archivo plano  
    public void crearArchivo()
    {
        try
        {
         archivoSalida= new ObjectOutputStream(new FileOutputStream ("Puntaje.dat"));
         System.out.println("Puntaje.dat se creo de forma correcta");
        }
        catch(Exception e)
        {
         System.out.println("Error al crear el archivo Puntaje.dat");   
        }
    }//Fin del metodo crearArchivo
      
    //Meotodo que devuelve la informacion al archivo en forma de arraylist   
    public ArrayList<PuntajeMayor> devolverInformacionAlArchivo()
        {
            ArrayList <PuntajeMayor> array=new ArrayList<PuntajeMayor>();
            
            try
            {
              while (true)
              {
                  array.add((PuntajeMayor)archivoEntrada.readObject());
              }
            }
            catch (Exception e )
            {
               System.out.println("Se llego al final del archivo");         
            }
            
            return array;
        }//Fin del metodo devolverInformacionAlArchivo
       
    //Metodo que ingresa la informacion del puntaje al archivo    
    public void ingresarInformacionPuntaje(PuntajeMayor puntaje)
    {
        try
        {
            archivoSalida.writeObject(puntaje);
            System.out.println("Se escribio de forma correcta la informacion en el archivo Puntaje.dat");
        }
        catch (Exception e)
        {
           System.out.println("Error al ingresar la informacion en el archivo Puntaje.dat"); 
        }
    }//Fin del metodo ingresarInformacionPuntaje
        
    //Metodo que devuelve la informacion del archivo como arrreglo
    public PuntajeMayor[] devolverInformacionDelArchivo() 
    {
        int tamano = getTamannio();
        PuntajeMayor arregloPuntaje[] = new PuntajeMayor[tamano];
        try {
            archivoEntrada = new ObjectInputStream(new FileInputStream("Puntaje.dat"));
            for (int contador = 0; contador < tamano; contador++) 
            {
                arregloPuntaje[contador] = (PuntajeMayor) archivoEntrada.readObject();
            }
        } catch (Exception e) 
        {
            System.out.println("Error al devolver Informacion del Archivo Como arreglo");
        }
        return arregloPuntaje;
    }//Fin del metodo devolverInformacionDelArchivo
        
          
   //Metodo para obtener el tamaño
    public int getTamannio()
   {
        int contador = 0;
        PuntajeMayor temporal;
        try {
            archivoEntrada = new ObjectInputStream(new FileInputStream("Puntaje.dat"));
            while (true)
            {
                temporal = (PuntajeMayor) archivoEntrada.readObject();
                contador++;
            }
        } catch (Exception e) 
        {
        }
        return contador;
    }//Fin del metodo getTamannio
    
}
