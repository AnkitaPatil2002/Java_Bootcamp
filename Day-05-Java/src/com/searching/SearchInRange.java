package com.searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={23,45,21,47,90,35,2};
        int start=2;
        int end=5;
        int target=23;
        boolean value=searchInRange(nums,start,end,target);
        System.out.println(value);
    }
    static boolean searchInRange(int[] nums,int start,int end,int target){
        if(nums.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(target==nums[i]){
                return true;
            }
        }
        return false;
    }
}
