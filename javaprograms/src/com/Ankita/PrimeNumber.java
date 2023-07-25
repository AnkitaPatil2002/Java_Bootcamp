package com.Ankita;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("The given number is not a prime number");
        }else{
            System.out.println("Given Number is Prime");
        }

    }
}
