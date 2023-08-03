import java.util.Arrays;

public class CyclicSort {
    //ques. 3,5,2,4,1
    //just in one for loop for reducing complexity
    //***    When given nos. from range 1,N => use cyclic sort     ***
    //Algorithm--> 3,5,2,1,4
    //after sorting -->1,2,3,4,5   index=value-1
    public static void main(String[] args) {
          int[] arr={3,5,2,4,1};
          CyclicSort(arr);
    }
    static void CyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;

            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
