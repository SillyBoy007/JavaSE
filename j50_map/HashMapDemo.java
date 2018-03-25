package j50_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String [] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("yi",1);
        map.put("er",2);
        map.put("san",3);
        map.put(null,0);
        System.out.println(map);
        System.out.println(map.get("er"));
        System.out.println(map.get("null"));

        Set<String> keyset = map.keySet();
        Iterator<String> ite = keyset.iterator();
        while (ite.hasNext()){
            String str = ite.next();
            System.out.println(str);
        }

    }
}
