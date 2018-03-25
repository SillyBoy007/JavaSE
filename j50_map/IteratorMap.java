package j50_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//使用Iterator将Map集合输出
public class IteratorMap {
    public static void main(String [] args){
        Map<String,Integer>  map = new HashMap<>();
        map.put("wang",1);
        map.put("xia",2);
        map.put("yun",3);
        System.out.println(map.get("wang"));

        //将Map集合变为Set集合,为了可以调用Iterator
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
        while (iter.hasNext()){
            Map.Entry<String,Integer> str = iter.next();
            System.out.println(str);
        }
    }
}
