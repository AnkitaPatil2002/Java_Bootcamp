import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(5,6,8,9,3,2);
        multiple(2,3,4,5,3,3);
    }
    //variable length argument always come at the end

    static void multiple(int a, int b, int ...v){}

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
