package Generics;

public class Main {
    public static void main(String[] args) {

        Content<Double> c=new Content<>();
        c.setName(45.0909);
        System.out.println(c.getName());

        Items<String,Double,Boolean> item=new Items<>();
        item.setName("sows",10.0,true);
        System.out.println(item.getName() + " "+ item.getPrice()+" "+item.getIsGood());

    }
}
