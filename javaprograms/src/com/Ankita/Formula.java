package com.Ankita;

import java.util.Scanner;

public class Formula {
   // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p = sc.nextInt();
        int t= sc.nextInt();
        int r=sc.nextInt();
        int simpleInterest= p*r*t/100;
        System.out.println("Simple intrest is "+ simpleInterest);
    }
}
