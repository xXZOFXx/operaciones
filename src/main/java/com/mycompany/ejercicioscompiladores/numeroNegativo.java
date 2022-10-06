/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscompiladores;

/**
 *
 * @author xxzofxx
 */
import java.util.Scanner;

public class numeroNegativo {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");

        num = sc.nextInt();
       
            if (num > 0) {
// mayor que cero: positivo
                System.out.println("Positivo: " + num);
            } else {
// si no es positivo: es negativo
                System.out.println("Negativo: " + num);

            }
// al salir del mientras tenemos la certeza que num e
        
    }
}
