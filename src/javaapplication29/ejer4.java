/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @authorAntonio
 */
public class ejer4 {
    public void ejer4(){
        Scanner xd = new  Scanner(System.in);
        // Pedir al usuario que ingrese el número de décadas
        System.out.print("Ingrese el número de décadas: ");
        int decadas = Integer.parseInt(xd.nextLine());

        // Convertir décadas en días
        int dias = decadas * 3650;

        // Mostrar el resultado
        System.out.println(decadas + " décadas son equivalentes a " + dias + " días.");
    }
    }
