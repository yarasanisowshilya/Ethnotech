package Opps.Encapsulation;
class Access1
{
    public int a=10;
    private int b=5;
    protected int c=2;
    int d=90;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
class Access2 extends Access1
{
    void printData()
    {
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
        System.out.println(d);
    }
}
public class Encap08 {
    public static void main(String[] args) {
        Access2 acc=new Access2();
        acc.printData();
    }
}
