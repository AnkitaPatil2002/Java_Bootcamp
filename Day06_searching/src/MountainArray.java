public class MountainArray {
    //find the peak in mountain array
    //{1,2,3,4,3,2,1}
    public static void main(String[] args) {
            int[] arr={1,2,5,7,6,4,3};
            System.out.println(peakIndexInMountainArray(arr));
            System.out.println(search(arr,6));
    }
    public static int search(int[]arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak, arr.length - 1);
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end){

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
    public static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end =arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return end;

    }

}
