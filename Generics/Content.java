package Generics;

public class Content<T extends Number> {
    T name;

    void setName(T name)
    {
        this.name=name;
    }
    public T  getName()
    {
        return name;
    }

}
