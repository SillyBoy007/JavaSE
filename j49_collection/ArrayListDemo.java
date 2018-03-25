package j49_collection;

import j22_object.Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//ArrayList
public class ArrayListDemo {
    public static void main(String [] args){
        //设置了泛型保证数据类型一至
        //List<String> all = new ArrayList<>();
        Collection<String> all = new ArrayList<>();
        System.out.println("长度:"+all.size()+",是否为空:"+all.isEmpty());
        all.add("hello");
        all.add("wang");
        all.add("wang");
        System.out.println("长度:"+all.size()+",是否为空:"+all.isEmpty());
        System.out.println(all);

        Object[] obj = all.toArray();

        for (int x=0;x<all.size();x++){
           // String str = all.get(x);//取得索引数据
            //System.out.println(str);
            System.out.println(obj[x]);
        }
    }
}
