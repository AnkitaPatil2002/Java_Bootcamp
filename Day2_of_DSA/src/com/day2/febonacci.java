package com.day2;

import java.util.Scanner;

public class febonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
        int i=2;
        while(i<=n){
            int temp = b;
            b = b + a ;
            a=temp;
            i++;
        }
        System.out.println(b);
    }
}
