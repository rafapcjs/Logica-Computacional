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
public class ejer1 {
    //desea calcular el perimetro de un pligono regular de 6 lados
   int lado , nu=6;
    
   public void nu(){
    
    lado = Integer.parseInt(JOptionPane.showInputDialog("digite el valor del lado"));

   int almacenar = (lado*nu);
   
       System.out.println("este es el resultado"+almacenar);
      
   }
}
