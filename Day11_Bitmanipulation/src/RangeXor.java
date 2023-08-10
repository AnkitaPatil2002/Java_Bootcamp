public class RangeXor {
    public static void main(String[] args) {
        //range xor for a,b=xor(b) ^ xor(a-1)
        int a=3;
        int b=9;
        int ans = startXor(b)^ startXor(a-1);
        System.out.println(ans);
    }
    // gives xor from 0 to a
    static int startXor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }

        return 0;

    }

}
