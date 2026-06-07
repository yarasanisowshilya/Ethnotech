package Exception;

public class CE {
    static void main(String[] args) {
        int a=10;
        int b=0;
        try
        {
            divide(a,b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero");
        }
    }
   static int divide(int a,int b)
    {
        return a/b;
    }


}
