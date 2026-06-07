package Collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("house1",1);
        map.put("house2",11);
        map.put("house3",10);
        map.put("house4",17);

        System.out.println(map.entrySet());
        for(Map.Entry<String,Integer> entry :map.entrySet())
                {
                    System.out.println(entry.getKey() + " : " +entry.getValue());
                }
        for(String key: map.keySet())
        {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println(map.putIfAbsent("house0",200));
        System.out.println(map.entrySet());
    }
}
