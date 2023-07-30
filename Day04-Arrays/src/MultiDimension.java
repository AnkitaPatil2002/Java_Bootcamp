import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //   int[][] arr =new int[3][];
        int[][] arr ={
                {1,2,3,5},//0th index
                {4,5},//1st index
                {7,8,9}//2nd index
        };
      //  for(int i=0;i<arr.length;i++){
     //       for(int j=0;j<arr.length;j++){
      //            System.out.print(arr[i][j]+" ");
      //      }
      //      System.out.println();
     //
        //   }
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
