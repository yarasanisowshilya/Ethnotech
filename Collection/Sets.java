package Collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        HashSet<String > hs=new HashSet<>();
        hs.add("hello");
        hs.add("hello");
        hs.add("hel");
        hs.add("sows");
        hs.add("ram");
        hs.remove("hel");
        System.out.println(hs);
        Set<String> s=new HashSet<>();
        s.add("hie");
        s.add("hie");
        s.add("ery");
        System.out.println(s);
        LinkedHashSet<String> lh=new LinkedHashSet<>();
        lh.add("hie");
        lh.add("hie");
        lh.add("ery");
        System.out.println(s);
    }
}
