package com.searching;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums={
                {10,2,3},
                {3,9,1}
        };
        int max=richestPerson(nums);
        System.out.println(max);
    }
    static int richestPerson(int[][] nums){
        int wealth =0;
        int max=0;
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                  wealth+=nums[row][col];
            }
            if(wealth>max){
                max=wealth;
            }
            wealth=0;

        }
        return max;
    }
}
