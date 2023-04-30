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
public class ejer2 {
//    //2. Desarrolle el algoritmo de la empresa XYZ, que permita calcular
//la nómina semanal de 5 obreros, con la siguiente
//características:
//e Valor Hora 1000 pesos.
//+ - Digitar el Número de Horas Trabajadas por semana por cada
//* Obrero
//* - Calcular el valor a pagar por cada obrero
//* - Calcular el Valor Total Pagados a Todos los Obreros
    // 
   int trabajadores []= new int [5];
     String nombre []= new String[5];
      int hora []= new int [5];
      int valordehoras =1000;
      int nomina;
      
    public void ejer2(){
        
        for (int i = 0; i <  trabajadores.length; i++) {
            nombre[i]= String.format(JOptionPane.showInputDialog("digite los nombres"+(i+1)));
            hora[i]= Integer.parseInt(JOptionPane.showInputDialog("digite las horas del trabajador"+"___"+(  nombre[i])));
            
            
            
            
            System.out.println("el valor a pagar por cada trabajador es "+" Trabajador"+nombre[i]+"  hora * precio"+  hora[i]* valordehoras);
            
            
            nomina+= hora[i]*valordehoras;
            
            
            
        }
        System.out.println("valor total de la nomina"+nomina);
        
        
        
        
    }
}
