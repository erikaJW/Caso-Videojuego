/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArchivoPuntaje;
import Modelo.MetodosPuntaje;
import Vista.GUI_Inicio;
import Vista.GUI_Juego;
import Vista.GUI_Perdida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Erika
 */
public class Controlador_GUI_Perdida implements ActionListener{
    
   GUI_Inicio gui_Inicio;
   GUI_Juego gui_Juego;
   GUI_Perdida gui_Perdida;
   
   ArchivoPuntaje archivoPuntaje;
   MetodosPuntaje metodosPuntaje;
   
   //Metodo constructor de la clase
    public Controlador_GUI_Perdida(GUI_Perdida gui_Perdida)
    {
        
        this.gui_Perdida= gui_Perdida;
        metodosPuntaje=new MetodosPuntaje();
        archivoPuntaje=new ArchivoPuntaje();     
        
    }//Fin del metodo constructor
    
    //Metodo actionPerformed para asignar las acciones a los botones.
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("OtraVez")) 
      {
           //System.out.println("Otra Vez");
          metodosPuntaje.registrarPuntajeMayor(gui_Perdida.getJt_Nombre(), Integer.parseInt(gui_Perdida.getJt_Puntaje()));
          gui_Inicio= new GUI_Inicio();
          this.gui_Inicio.setVisible(true);
      } 
        if(e.getActionCommand().equals("Salir"))
        {
           System.exit(0);
        }
        
        if(e.getActionCommand().equals(("Guardar")))
        {
             metodosPuntaje.registrarPuntajeMayor(gui_Perdida.getJt_Nombre(), Integer.parseInt(gui_Perdida.getJt_Puntaje()));
             escribirInformacionArchivo();
             this.gui_Perdida.limpiar();
        }
    }//Fin del metodo actionPerformed
    
    //Meotod que escribe la informacion en el archivo
     public void escribirInformacionArchivo() {
        metodosPuntaje.escribirInformacion();
    }//Fin del metodo escribir informacion

     //Metodo que devuelve la puntuacion en el arreglo para que sea visible en la pantalla de peridda
    public String[] devolverPuntosEnArreglo() {
        return metodosPuntaje.devolverPuntosEnArreglo();

    }
    
    
}
