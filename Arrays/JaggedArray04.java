package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        arr1[0]=new int[3];
        arr1[1]=new int[2];
        arr1[2]=new int[1];
        for(int i=0;i<arr1.length;i++)
        {
            for (int j=0;i< arr1[i].length;j++)
            {
               arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr1));
    }
}
