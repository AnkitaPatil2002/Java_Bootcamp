import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[4];

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //for(int i:arr){
       //     System.out.print(i + " ");
       // }
        System.out.println(Arrays.toString(arr));
    }
}
