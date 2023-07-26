package com.day2;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        switch(empId){
            case 1:
                System.out.println("Hello Alex!");
                break;
            case 2:
                System.out.println("Have you eaten food!");
                break;
            case 3:
                System.out.println();
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Enter Correct employee id");

        }
    }
}
