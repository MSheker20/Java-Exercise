/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.msheker.primenumberchecker;

import java.util.Scanner;

/**
 *
 * @author musta
 */
public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        scn.close();
        
        boolean isPrime = primeChecker(num);
        
        if (isPrime) System.out.printf("%d is a prime number.", num);
        else System.out.printf("%d is not a prime number.", num);
    }
    
    
    public static boolean primeChecker(int a){
        int count = 0;
        for (int i = 2; i < a; i++) {
            if (a%i == 0) {
                count++;
            }
        }
        return count == 0;
    }
}
