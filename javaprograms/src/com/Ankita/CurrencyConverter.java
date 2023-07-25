package com.Ankita;

import java.util.Scanner;
import java.lang.Math;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double uq=0.012;
        int indianRupees=sc.nextInt();
        double res=indianRupees * 0.012;

        System.out.println("The American Usd is "+res);
    }
}
