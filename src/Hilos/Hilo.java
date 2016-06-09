/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Vista.GUI_Juego;
import static java.lang.Thread.sleep;

/**
 *
 * @author Erika
 */
public class Hilo extends Thread {
  
    GUI_Juego ventanaJuego;
    int puntuacion;
    
    //Metodo constructor de la clase
    public Hilo(GUI_Juego ventanaJuego)
    {
      this.ventanaJuego=ventanaJuego;  
    }//Fin del metodo constructor
    
    //Metodo run que controla el hilo general de la ventana
    public void run()
    {
        try
        {
          while(true)  
          {
              sleep(10);
              ventanaJuego.moverFondo();
              ventanaJuego.verificarEstado();
              ventanaJuego.moverObstaculo();
              ventanaJuego.moverObstaculo2();
              ventanaJuego.moverObstaculo3();
              ventanaJuego.moverObstaculo4();
              ventanaJuego.colision();
          }
        }
        
        catch(Exception e)
        {
            System.out.println("Error en la ejecucion: "+e);
        }
    }//Fin del metodo run
    
    
    // METODOS RUN DE LOS OBSTACULOS
    /*
    public void runObstaculoUno()
    {
        try
        {
          while(true)  
          {
              sleep(10);
              ventanaJuego.moverObstaculo();
          }
        }
        
        catch(Exception e)
        {
            System.out.println("Error en la ejecucion: "+e);
        }
    }
    
    public void runObstaculoDos()
    {
        try
        {
          while(true)  
          {
              sleep(5);
              ventanaJuego.moverObstaculo2();
          }
        }
        
        catch(Exception e)
        {
            System.out.println("Error en la ejecucion: "+e);
        }
    }
    
     public void runObstaculoTres()
    {
        try
        {
          while(true)  
          {
              sleep(7);
              ventanaJuego.moverObstaculo3();
          }
        }
        
        catch(Exception e)
        {
            System.out.println("Error en la ejecucion: "+e);
        }
    }
     
      public void runObstaculoCuatro()
    {
        try
        {
          while(true)  
          {
              sleep(3);
              ventanaJuego.moverObstaculo4();
          }
        }
        
        catch(Exception e)
        {
            System.out.println("Error en la ejecucion: "+e);
        }
    }*/
}
