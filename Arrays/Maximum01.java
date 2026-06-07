package Arrays;

public class Maximum01 {
    public static void main(String args[])
    {
        int arr[]={2,4,5,789,5};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
