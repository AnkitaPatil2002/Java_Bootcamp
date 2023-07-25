package com.Ankita;

import java.util.Scanner;
import java.lang.String;
public class PalindromOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        int front=0;
        int back= name.length()-1;
        boolean bool = true;

        while(front<back){
            if(name.charAt(front)!=name.charAt(back)){
                bool=false;
                break;
            }
            front++;
            back--;

        }
        if(bool){
            System.out.println("The Given string is Palindrome");
        }else{
            System.out.println("The Given string is not Palindrome");
        }
    }
}
