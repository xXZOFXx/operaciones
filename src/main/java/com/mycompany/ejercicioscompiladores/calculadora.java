/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscompiladores;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author xxzofxx
 */
public class calculadora {

    public static void main(String[] args) {

        int numUno;
        int numDos;
        String operacion;

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce numero 1 ");

        numUno = sc.nextInt();

        System.out.println("operación");

        operacion = sc.next();

        System.out.println("introduce numero 2 ");

        numDos = sc.nextInt();
/*
        Pattern suma = Pattern.compile("^+");
        Pattern resta = Pattern.compile("^-");
        Pattern mult = Pattern.compile("^*x");
        Pattern div = Pattern.compile("^/");

        Matcher mat = suma.matcher(operacion);

        Matcher matResta = resta.matcher(operacion);

        Matcher matMult = mult.matcher(operacion);
        Matcher matDiv = div.matcher(operacion);
        
        
        
         if (mat.find()) {
            int resutado = numUno + numDos;
            System.out.println("Resultado: " + resutado);
        } 
         if (matResta.find()) {
            int resutado = numUno - numDos;
            System.out.println("Resultado: " + resutado);
        }
         if (matMult.find()) {
            int resutado = numUno * numDos;
            System.out.println("Resultado: " + resutado);
        }
         if (matDiv.find()) {
            int resutado = numUno / numDos;
            System.out.println("Resultado: " + resutado);
        } 

        
        
        
        */
        if (operacion.equals("+")) {
            int resutado = numUno + numDos;
            System.out.println("Resultado: " + resutado);
        } 
         if (operacion.equals("-")) {
            int resutado = numUno - numDos;
            System.out.println("Resultado: " + resutado);
        }
         if (operacion.equals("*")) {
            int resutado = numUno * numDos;
            System.out.println("Resultado: " + resutado);
        }
         if (operacion.equals("/")) {
            int resutado = numUno / numDos;
            System.out.println("Resultado: " + resutado);
        } 

    }

}
