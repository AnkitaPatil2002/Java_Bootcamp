public class Shadowing {
    static int x=90;//shadowed
    public static void main(String[] args) {

        System.out.println(x);//90
        //scope is begin when it is being initialized
        int x=40;
        System.out.println(x);//40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
