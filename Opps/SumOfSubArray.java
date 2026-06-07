package Opps;

import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the K value");
        int k=sc.nextInt();
        int max=0;
        int wsum=0;
        for(int i=0;i<k;i++)
        {
            wsum+=arr[i];
        }
        max=wsum;
        for(int i=k;i<n;i++)
        {
            wsum=wsum-arr[i-k]+arr[i];
            max=Math.max(wsum,max);
        }
        System.out.println(max);
    }
}
