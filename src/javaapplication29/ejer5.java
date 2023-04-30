/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class ejer5 {
    public  void ejerd (){
        
        
      //. La presión, el volumen y la temperatura de una masa de aire se relacionan por la formula: masa = (presión* volumen)/(0.37
//* temperatua ¨+460
      int presion , volumen , temperatura;
        int cost =460;
        
        
    presion =   Integer.parseInt(JOptionPane.showInputDialog("digite el valor de la presión"));
      
    volumen= Integer.parseInt(JOptionPane.showInputDialog("digite el valor del volumen"));
    
    temperatura = Integer.parseInt(JOptionPane.showInputDialog("digite el valor de la temperatura"));
    
    
        System.out.println(" please wait a moment while realize exercis");
        
        
        JOptionPane.showMessageDialog(null, "el resultado es"+""+  ((presion*volumen)*(temperatura*cost)));


    }
}
