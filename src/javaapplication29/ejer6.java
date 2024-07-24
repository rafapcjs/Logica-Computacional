/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class ejer6 {
    
    public void ejer6 (){
            //Calcular el numero de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, si la formula es:
//num. pulsaciones = (220 - edad)/10
    
    
    
        System.out.println(" please waita moment for run file");
        
        int edad ;
        
        
       edad = Integer.parseInt(JOptionPane.showInputDialog("digie el numero de edad"));
        System.out.println("la pulsación es  "+"  "+ ((220-edad))/(10) );
        
    }
    
    
    
    
}
