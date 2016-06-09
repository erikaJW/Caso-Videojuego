/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.GUI_Inicio;
import Vista.GUI_Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Erika
 */
public class Controlador_GUI_Inicio implements ActionListener{
    
    GUI_Juego ventanaJuego;
    GUI_Inicio ventanaInicio;
    
    //Metodo contructor de la clase
    public Controlador_GUI_Inicio(GUI_Inicio ventanaInicio)
    {
   //  ventanaJuego= new GUI_Juego();
        this.ventanaInicio=ventanaInicio;
    }//Fin del metodo constructor
    
    
    //Metodo actionPerformed para asignar las acciones a los botones.
    public void actionPerformed(ActionEvent e)
    {
       if(e.getActionCommand().equals("Jugar")) 
      {
           //System.out.println("Jugar");
         jugar();
         
      }  
    }//Fin del metodo actionPerformed
    
    
    //Metodo que controla las ventanas de inicio y juego cuando se presiona el boton de jugar
    public void jugar()
    {
        ventanaJuego=new GUI_Juego();
        ventanaJuego.setVisible(true);
        ventanaInicio.hide();
    }//Fin del metodo jugar
    
}//Fin de la clase