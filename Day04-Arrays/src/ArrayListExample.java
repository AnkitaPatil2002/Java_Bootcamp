import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
 //       list.add(67);
 //       list.add(847);
 //       list.add(789);
 //       list.add(89);
 //       list.add(60);
 //       System.out.println(list.contains(389));
 //       list.set(0,99);
 //       list.remove(2);
 //       System.out.println(list);
        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //get items at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here
        }

    }
}
