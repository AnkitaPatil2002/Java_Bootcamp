import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        int ans=greeting();
        System.out.println(ans);
    }
    static int greeting(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two  numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum = a+b;
        return sum ;
    }
}
