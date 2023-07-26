package com.day2;

public class CheckOccurence {
    public static void main(String[] args) {
        int n = 1385757879;
        int rem;
        int count=0;
        while(n!=0){
            rem = n%10;
            if(rem==8){
                count++;
            }
            n=n/10;

        }
        System.out.println("The seven count is"+count);
    }
}
