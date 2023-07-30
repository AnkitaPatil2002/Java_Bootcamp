package com.searching;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums={18,124,9,1764,98,1};
        int count=0;
        int sum=0;
        for(int i=0;i< nums.length;i++){
            while(nums[i]!=0){
                 count++;
                 nums[i]/=10;
            }
            if(count%2==0){
                sum++;
            }
            count=0;
        }
        System.out.println(sum);
    }
    static int digit2(int num){
           return (int)(Math.log10(num)) +1;
    }
}
