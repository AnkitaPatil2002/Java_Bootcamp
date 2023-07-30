package com.searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6,7,8},
                {9,10,11}
        };
        int target=10;
        int[] ans=search2D(arr,target);
        int max=max(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(max);
    }
    static int[] search2D(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int element : ints){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
