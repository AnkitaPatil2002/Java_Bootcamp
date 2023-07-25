package com.Ankita;

import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int rem;
        int sum=0;
        while(n!=0){
              rem=n%10;
              sum+=Math.pow(rem, 3);
              n=n/10;
        }
        if(sum==temp){
            System.out.println("Given Number is ArmStrong");
        }else{
            System.out.println("Given Number is not an Armstrong Number");
        }
    }
}
