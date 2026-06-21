package LeetCode;

import java.util.Scanner;

public class PivotIndex724 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int totalsum=0;
        for(int i=0;i<n;i++)
        {
            totalsum+=arr[i];
        }
        int leftsum=0;
        int index=0;
        for(int i=0;i<n;i++)
        {
            int rightsum=totalsum-leftsum-arr[i];
            if (rightsum==leftsum)
                index= i;
            leftsum+=arr[i];
        }
        System.out.println(index);
    }
}
