package Generics;

import java.util.List;

public class WildCards {
    public static void ListDisplay(List<?> l)
    {
        System.out.println(l);
    }

    public static void main(String[] args) {
        ListDisplay(List.of(1,2,3,4));
        ListDisplay(List.of("sows","super"));
    }
}
