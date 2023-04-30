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
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int nu;
   
   
   
   
        do {        
            
          nu=  Integer.parseInt(JOptionPane.showInputDialog("DIGITE QUE PROYECTO DESEA EJECUTAR"               
                  
                  +"\"si presiona 0 se acaba\""));
          


          
                    ;
            switch(nu){
                
                case 1 : 
                    System.out.println("desea calcular el perimetro de un pligono regular de 6 lados");
                    ejer1 K = new ejer1();
                K.nu();
                                  
                break;
                 case 2 : System.out.println("2. Desarrolle el algoritmo de la empresa XYZ, que permita calcular\n" +
"la nómina semanal de 5 obreros, con la siguiente\n" +
"características:\n" +
"e Valor Hora 1000 pesos.\n" +
"+ - Digitar el Número de Horas Trabajadas por semana por cada\n" +
"* Obrero\n" +
"* - Calcular el valor a pagar por cada obrero\n" +
"* - Calcular el Valor Total Pagados a Todos los Obreros");
                   
                 
                 ejer2 k = new ejer2();
                 k.ejer2();
                break;
                 case 3 : System.out.println("3. Digitar un Numero Entero Positivo y dividirlo en 5 dígitos, EL Primer y Último Digito Se eleva\n" +
"al Cuadrado.\n" +
""); 
                 
                 ejer3 kj = new  ejer3();
                 kj.ejer3();
                 
                 
                break;
               
                
                case 4: System.out.println("4. Realiza un Algoritmos que Convierta de Décadas (10 años) a Días.");
                
                ejer4 d= new ejer4();
                d.ejer4();
                break;
                
                
                
                case 5: System.out.println("5. La presión, el volumen y la temperatura de una masa de aire se relacionan por la formula: masa = (presión* volumen)/(0.37\n" +
"1 Algoritmo masa de un gas\n" +
"presión-0\n" +
"volumen-0\n" +
"temperatura-0\n" +
"(temperatura + 460))\n" +
"Escribir \"cual es la presion del gas?\"");
                
              ejer5 dd = new ejer5();
              
              dd.ejerd();

                break;
                
                case 6: System.out.println("﻿\n" +
"6. Calcular el numero de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, si la formula es:\n" +
"num. pulsaciones = (220 - edad)/10");
                
              ejer6 xd = new ejer6();
              xd.ejer6();
              
              
                             case 7 :System.out.println("Convertir Farenheit a Centigrados");
                             ejer7 j = new ejer7();
                             
                             j. ejer7();
                             break;
                             
                             
                             case 8 :System.out.println("Convertir Farenheit a Centigrados");
                             ejer8 f = new ejer8();
                             
                           f.ejer8();
                             break;
                             
                             
                             
                             
                
            }            
            
            
        } while (nu!=0);
    }}