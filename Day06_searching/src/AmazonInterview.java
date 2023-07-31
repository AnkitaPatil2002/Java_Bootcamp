public class AmazonInterview {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,11,12,15,20,23,30};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //find start with a box of size 2
        int start =0;
        int end =1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp=end+1;
            //double the box value
            //end=previous end+size
            end=end+(end-start +1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
              int mid=start+(end-start)/2;
              if(target<arr[mid]){
                       end=mid-1;
              }else if(target>arr[mid]){
                       start=mid+1;
              }else{
                       return mid;
               }}
        return -1;
    }
}
