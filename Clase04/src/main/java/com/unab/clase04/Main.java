/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.unab.clase04;

import java.util.Scanner;

/**
 *
 * @author cb272
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num[] = new int[2];
        for (int i = 0; i <= 1; i++) {
            System.out.println("Numero " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        
        for (int i = 0; i <= num.length; i++) {
            if (num[i] < 0) {
                System.out.println("El numero " + (i+1) + " es " + num[i] + " y es negativo");

            } else {
                System.out.println("El numero " + (i+1) + " es " + num[i] + " y es positivo");
            }
        }
    }
    
}
