import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums= {27,38,8,89,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
