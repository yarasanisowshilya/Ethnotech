package Generics;

public class Items <T,U,V>{
    T name;
    U price;
    V isGood;

    void setName(T name,U price,V isGood)
    {
        this.name=name;
        this.price=price;
        this.isGood=isGood;
    }



    public T  getName()
    {
        return name;
    }
    public U getPrice()
    {
        return price;
    }

    public V getIsGood()
    {
        return isGood;
    }
}
