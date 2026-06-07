package Arrays;
import java.util.*;
public class BuySell02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int n;
        System.out.println("Enter size:");
        n = sc.nextInt();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int profit = 0;
        int buy=arr[0];
        int i=1;
        for ( i = 1; i < arr.length; i++) {

            if(arr[i]<buy)
            {
                profit+=arr[i-1]-buy;
                if(i!=arr.length-1)
                    buy=arr[i];
            }
        }
        if(i==arr.length&&arr[i]>buy)
        {
            profit+=arr[i-1]-buy;
        }
        System.out.println(profit);
    }
}
