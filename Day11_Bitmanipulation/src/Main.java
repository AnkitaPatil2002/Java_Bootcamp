public class Main {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isOdd(n));

    }
    static int isOdd(int n){
          return n & 1;
    }

}