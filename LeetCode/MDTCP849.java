package LeetCode;

import java.util.Scanner;

public class MDTCP849 {

        public static  int maxDistToClosest(int[] seats) {
            int prev=-1;
            int max=0;
            for(int i=0;i<seats.length;i++)
            {
                if(seats[i]!=0)
                {
                    if(prev==-1)
                    {
                        max=i;
                    }
                    else
                    {
                        max=Math.max(max,(i-prev)/2);
                    }
                    prev=i;
                }
            }
            max=Math.max(max,seats.length-1-prev);
            return max;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int seats[] = new int[n];

        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        System.out.println(maxDistToClosest(seats));
    }

    }

