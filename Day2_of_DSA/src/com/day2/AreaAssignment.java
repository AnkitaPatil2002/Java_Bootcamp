package com.day2;

import java.util.Scanner;

public class AreaAssignment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String area= sc.next();

        switch(area){
            case "Circle":
                System.out.println("Enter radius of circle..");
                int radius=sc.nextInt();
                int pie=22/7;
                System.out.println("Area of a circle is "+(pie*Math.pow(radius,2)));
                break;
            case "Triangle":
                System.out.println("Enter length and bredth: ");
                int b=sc.nextInt();
                int h=sc.nextInt();
                System.out.println("Area of triangle is"+(1/2*b*h));
                break;
            case "Rectangle":
                System.out.println("Enter length and bredth of rectangle");
                int length= sc.nextInt();
                int bred= sc.nextInt();
                System.out.println("Area of rectangle is"+(length*bred));
                break;
            case "Parallelogram":
                System.out.println("Enter the values");
                int d=sc.nextInt();
                int e= sc.nextInt();
                System.out.println("Area of Parallelogram is "+(d*e));
                break;
            case "Rhombus":
                System.out.println("Enter the values of diagonal");
                int p=sc.nextInt();
                int q=sc.nextInt();
                System.out.println("Area of Rhombus"+(p*q/2));
                break;
            case "Equilateral Triangle":
                System.out.println("Enter a value of side");
                int a=sc.nextInt();
                System.out.println("The area pf Equilateral Triangle is "+ (Math.sqrt(3)/4*Math.pow(a,2)));
                break;
            default:
                System.out.println("Right the correct sentence!");
        }
    }
}
