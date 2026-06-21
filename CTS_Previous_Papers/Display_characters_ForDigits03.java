package CTS_Previous_Papers;

import java.util.Scanner;

public class Display_characters_ForDigits03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the digits:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            char ch = (char) arr[i];
            System.out.println(arr[i] + "-" + ch);
        }

    }
}
