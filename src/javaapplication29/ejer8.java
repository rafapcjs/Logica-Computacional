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
public class ejer8 {
    
    public void ejer8(){
        
        
        //8. Convertir Centigrados a Farenheit
//F=9/5*C+32
System.out.println("8. Convertir Centigrados a Farenheit");
    int c ;
    c = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
    
    
        System.out.println(" resultado es"+""+(9/5*c+32));
    }
    
}
