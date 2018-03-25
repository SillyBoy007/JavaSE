package j49_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {
    public static void main(String [] args){
        Set<String> all = new HashSet<>();
        all.add("ijad");
        all.add("yu");
        all.add("asd");
        Iterator<String> ite = all.iterator();
        while (ite.hasNext()){
            String str = ite.next();
            System.out.println(str);
        }

    }
}
