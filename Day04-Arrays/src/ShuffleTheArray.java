import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        //nums = [2,5,1,3,4,7], n = 3
        int[] arr= {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int[] shuffle(int[] arr,int n){
        int[] nums= new int[n*2];
        int i=0;
        int start=0;
        int start_plus=3;
        while(i<=n){
            nums[i]=arr[start];
            start++;
            nums[i+1]=arr[start_plus];
            start_plus++;

        }
        return nums;
    }
}
