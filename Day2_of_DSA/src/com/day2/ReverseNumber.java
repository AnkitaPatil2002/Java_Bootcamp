package com.day2;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 23597;
        int sum=0;
        while(n!=0){
             int rem = n%10;
             sum=sum*10+rem;
             n/=10;

        }
        System.out.println(sum);
    }
}
