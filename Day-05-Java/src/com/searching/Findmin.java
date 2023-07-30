package com.searching;

public class Findmin {
    public static void main(String[] args) {
        int[] arr={26,38,92,5,6,23};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
          int min=arr[0];
          for(int i=1;i<arr.length;i++){
              if(min>arr[i]){
                  min=arr[i];
              }
          }
          return min;
    }
}
