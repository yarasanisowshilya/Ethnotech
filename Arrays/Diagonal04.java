package Arrays;

import java.util.Scanner;

public class Diagonal04 {

    public static void main(String[] args) {

        int arr1[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix elements:");

        // Input
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Elements:");

        // Print diagonals
        for (int i = 0; i < arr1.length; i++)
        {

            for (int j = 0; j < arr1[i].length; j++)
            {

                // Primary or Secondary diagonal
                if (i == j || i + j == arr1.length - 1)
                {

                    System.out.print(arr1[i][j] + " ");
                }
            }
        }
    }
}