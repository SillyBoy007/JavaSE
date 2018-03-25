package j50_map;

import java.util.*;

public class HashTableDemo {
    public static void main(String [] args){
        Map<String,Integer> map = new Hashtable<>();
        map.put("yi",1);
        map.put("er",2);
        map.put("san",3);
      //map.put(null,0); 这里会报空指向异常
        System.out.println(map);
        System.out.println(map.get("er"));
      //System.out.println(map.get(null));

        Set<String> keyset = map.keySet();
        Iterator<String> ite = keyset.iterator();
        while (ite.hasNext()){
            String str = ite.next();
            System.out.println(str);
        }
    }
}
