public class Main {
    public static void main(String[] args) {
       int[] arr={2,3,5,9,14,16,18};
       int target=14;
       int key=ceiling(arr,target);
       System.out.println(key);
    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid= start +(end-start)/2;
        while(start<end){
            if(target<mid){
                end=mid-1;
            }else if(target>mid){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}