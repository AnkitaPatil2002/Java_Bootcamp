import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        String name= sc.next();
        fun(num);
        fun(name);
    }
    static void fun(int a){
        System.out.println("Hello its a number !"+a);
    }
    static void fun(String name){
        System.out.println("Hello its a name !"+name);
    }
}
