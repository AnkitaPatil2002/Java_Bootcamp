package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=20;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //better way to find mid s+(e-s)/2
                int mid= start+(end-start)/2;
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }
        }
        return -1;
    }
}
