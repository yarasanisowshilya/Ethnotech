package LeetCode;

import java.util.Scanner;
import java.util.Arrays;
public class Coins {

    public static int maxbox(int arr[])
    {
        Arrays.sort(arr);
        int n=arr.length;
        int lowlimit=arr[0];
        int highlimit=arr[n-1];
        int box[]=new int[100];
        int max=0;
        for(int i=lowlimit;i<=highlimit;i++)
        {
            int num=i;
            int sum=0;
            while(num>0)
            {
                sum+=num%10;
                num/=10;
            }
            box[sum]++;
            if(box[sum]>max)
            {
                max=box[sum];
            }
        }
        return  max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        System.out.println("enter coin id:");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxbox(arr));
    }
}
