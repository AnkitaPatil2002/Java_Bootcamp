package com.searching;

public class LinearSearch {
    //arr=[18,25,63,74,5,4,2]
    //find whether 74 exist i  the array or not
    public static void main(String[] args) {
        int[] nums={20,38,46,57,99,23,11};
        String str="Ankita";
        char key='f';
        int target=99;
        int ans=linearSearch(nums,target);
        boolean find=iteratingOverString(str,key);
        System.out.println(find);
        System.out.println(ans);

    }
    //searching in array it returns index if item found
    //else item not found
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int i=0;i<arr.length;i++){
            //check for element at every index
            int element = arr[i];
            if(element == target){
                  return element;
            }
        }
        return -1;
    }
    static boolean iteratingOverString(String str ,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
