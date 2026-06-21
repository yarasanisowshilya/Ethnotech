package Serialization_Deseriallization;

import java.io.Serializable;

public class SER implements Serializable {
    int id;
    String name;

    public SER(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
