/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.msheker.ucgenyazdirma;

/**
 *
 * @author musta
 */
public class UcgenYazdirma {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            newLine();
        }
        System.out.println("-------------------");
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            newLine();
        }
        System.out.println("-------------------");
        for (int i = 1; i < 10; i++) {
            for (int l = 0; l < 10-i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            newLine();
        }
        System.out.println("-------------------");
        for (int i = 10; i < 0; i--) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            newLine();
        }
        }
    
    public static void newLine(){
        System.out.println("");
    }
}
