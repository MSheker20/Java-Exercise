/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.msheker.bolmekontrol;

import java.util.Scanner;

/**
 *
 * @author musta
 */
public class BolmeKontrol {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int num1 = scn.nextInt();
        
        System.out.print("İkinci sayıyı girin: ");
        int num2 = scn.nextInt();
        scn.close();
        
        if (bolunmeKontrol(num1, num2)) {
            System.out.printf("%d sayısı %d sayısına tam bölünüyor", num1, num2);
        }else{
            System.out.printf("%d sayısı %d sayısına tam bölünmüyor", num1, num2);
        }
    }
    
    public static boolean bolunmeKontrol(int a, int b){
        return a%b == 0;
    }
}
