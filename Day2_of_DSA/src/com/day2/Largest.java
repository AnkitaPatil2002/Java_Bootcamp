package com.day2;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber= in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber=in.nextInt();

       // int max=firstNumber;
     //   if(secondNumber>max){
    //        max=secondNumber;
     //   }
    //    if(thirdNumber>max){
    //        max=thirdNumber;
    //    }
        int max= Math.max(thirdNumber,Math.max(firstNumber,secondNumber));
        System.out.println(max+ "is maximum one");
    }
}
