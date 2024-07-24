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
public class ejer7 {
    
    public void ejer7(){
        // Convertir Farenheit a Centigrados
        System.out.println(" Convertir Farenheit a Centigrados");
        
        // C = (F - 32) * (5 / 9) 
        
        
        int f ;
        
        f = Integer.parseInt(JOptionPane.showInputDialog("digite el valor farenheit"));
        
        System.out.println(" el resultado es"+ ""+  (f-32)*5/9);
    }
}
