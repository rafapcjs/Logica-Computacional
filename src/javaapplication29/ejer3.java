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
public class ejer3 {
    int nu;
   //3. Digitar un Numero Entero Positivo y dividirlo en 5 dígitos, EL Primer y Último Digito Se eleva
//al Cuadrado.
public void ejer3 (){
        double numero;

    
    
numero= Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO"));
        // Dividir el número en 5 dígitos
        double digito5 = numero % 10;
        numero /= 10;
        double digito4 = numero % 10;
        numero /= 10;
        double digito3 = numero % 10;
        numero /= 10;
        double digito2 = numero % 10;
        numero /= 10;
        double digito1 = numero % 10;

        // Elevar al cuadrado el primer y último dígito
        double resultado1 = digito1 * digito1;
        double resultado5 = digito5 * digito5;

        // Mostrar el resultado
        System.out.println("El primer dígito elevado al cuadrado es: " + resultado1);
        System.out.println("El último dígito elevado al cuadrado es: " + resultado5);
  
}}
