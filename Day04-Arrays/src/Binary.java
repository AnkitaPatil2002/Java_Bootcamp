public class Binary {

        public static void main(String[] args) {
            int[] arr={2,3,5,9,14,16,18};
            int target=14;

            System.out.println(ceiling(arr,target););
        }
        static void ceiling(int[] arr,int target){
             int start=0;
             int end=arr.length-1;

             while(start<=end){
                 int mid= start +(end-start)/2;
                 if(target<mid){
                     end=mid-1;
                 }else if(target>mid){
                    start=mid+1;
                 }
                 else if(target==mid){
                     System.out.println(arr[mid]);
                 }
                 else{
                     return arr[mid+1];
                 }
             }

        }

}
