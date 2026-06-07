package Arrays;

import java.util.*;

public class Sum0fTwoDimension04 {
    public static void main(String[] args) {
        int arr1[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("please provide rows and columns");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int result=0;
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                result+=arr1[i][j];
            }
        }
        System.out.println(result);
        System.out.println(Arrays.deepToString(arr1));
    }
}
