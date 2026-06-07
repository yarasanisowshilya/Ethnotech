package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Beat it");
        list.add("Despacito");
        list.add("gangam Stylle");
        list.add("Hips Dont Lie");
        list.add("");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(String l:list)
        {
            System.out.println(l);
        }
        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
        Object[] arr=list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

    }
}
