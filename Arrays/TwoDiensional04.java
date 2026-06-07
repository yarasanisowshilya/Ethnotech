package Arrays;
import java.util.*;
public class TwoDiensional04 {
   public  static void main(String[] args) {
        int arr1[][]=new int[3][];
       System.out.println(arr1.length);//3(In 2D array the length indicate no.of rows,no need to mention cols)

       int arr2[][]={
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<arr2[i].length;j++)
           {
               System.out.println(arr2[i][j]);
           }
       }
       System.out.println(Arrays.toString(arr2[1]));//if only arr2[1],it prints reference
       System.out.println(arr2[2][2]);
       System.out.println(Arrays.toString(arr2));//it prints memory address of each row because it stores ref of that values
       System.out.println(Arrays.deepToString(arr2));

       int arr3[][]=new int[3][3];
       Scanner sc=new Scanner(System.in);
       System.out.println("please provide rows and columns");
       for(int i=0;i<arr3.length;i++)
       {
           for(int j=0;j<arr3[i].length;j++)
           {
               arr3[i][j]=sc.nextInt();
           }
       }
       System.out.println(Arrays.deepToString(arr3));
   }


}
