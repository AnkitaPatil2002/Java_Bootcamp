import java.util.Arrays;

public class SmallestArray {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,8,8,10};
        int target =7;
        int[] arr1=findArrayIndex(arr,target);
        System.out.println(Arrays.toString(arr1));
    }
    static int[] findArrayIndex(int[] arr ,int target){
        int[] arr1={-1,-1};

        arr1[0]=search(arr,target,true);
        if(arr1[0]!=-1){
             arr1[1] =search(arr,target,false);
        }


        return arr1;
    }
    //this function just returns the index value of target
    static int search(int[] nums ,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                //potential ans is found
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
