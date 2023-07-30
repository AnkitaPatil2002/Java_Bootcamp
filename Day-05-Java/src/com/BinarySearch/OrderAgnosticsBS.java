package com.BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr={-18,-12,-11,0,2,3,4,5,6,7,67,78,99};
        int target =7;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            //better way to find mid s+(e-s)/2
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                 if(target<arr[mid]){
                        end=mid-1;
                 }else{
                       start=mid+1;
                 }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
