package LeetCode;

import java.util.Scanner;

public class Kadanes {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N value:");

        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<n;i++)
        {
            currsum+=arr1[i];
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }
            if(currsum<0)
            {
                currsum=0;
            }
        }

        System.out.println(maxsum);
    }
}
