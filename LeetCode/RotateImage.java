package LeetCode;
import java.util.*;
public class RotateImage {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int n= arr1.length;
        System.out.println("please provide rows and columns");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=i;j<arr1[i].length;j++)
            {
                if(i!=j)
                {
                    int temp=arr1[i][j];
                    arr1[i][j]=arr1[j][i];
                    arr1[j][i]=temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr1[j][i];
                arr1[j][i]=arr1[j][n-i-1];
                arr1[j][n-i-1]=temp;
            }

        }
        System.out.println(Arrays.deepToString(arr1));
    }
}
