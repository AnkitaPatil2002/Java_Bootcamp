package com.day2;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("Red red");
                break;
            case "banana":
                System.out.println("banana here");
                break;
            case "orange":
                System.out.println("I love oranges");
                break;
            default:
                System.out.println("Enter Valid Fruit!");
        }
    }
}
