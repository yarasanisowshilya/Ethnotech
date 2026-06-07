package Exception;

public class ChorPolice {

        private int amount;
        private boolean isCaught;
    static void chor(int amount,boolean isCaught)throws MyException
        {
            if(amount<0)
            {
                throw new ArithmeticException("the theif is Innocent");
            }
            if(isCaught)
            {
                throw new MyException("the theif is caught");
            }
        }


    public static void main(String[] args) {

        try
        {
            chor(-562,true);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Excuted");
        }
    }
}
