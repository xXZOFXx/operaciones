/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicioscompiladores;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author xxzofxx
 */
public class EjerciciosCompiladores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Nombre empieza por Ab .");
        cadena = sc.nextLine();
        System.out.print("Introduce el texto a analizar : ");
        Pattern pat = Pattern.compile("^Ab");
        Matcher mat = pat.matcher(cadena);
        if (mat.find()) {
            System.out.println("Nombre válido");
        } else {
            System.out.println("Nombre No valido");
        }

    }
}
