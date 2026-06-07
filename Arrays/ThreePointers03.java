package Arrays;

public class ThreePointers03 {


    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,4,5,6,8};
        int arr3[]={2,3,6,9,12};
        findCommonElemnts(arr1,arr2,arr3);
    }
    public static void findCommonElemnts(int arr1[],int arr2[],int arr3[])
    {
        int x=0,y=0,z=0;
        while(x<arr1.length && y<arr2.length && z<arr3.length)
        {
            if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
            {
                System.out.print(arr1[x]+" ");
                x++;
                y++;
                z++;
            }
            else if(arr1[x]<arr2[y])
                x++;
            else if(arr2[y]<arr3[z])
                y++;
            else z++;
        }
    }
}