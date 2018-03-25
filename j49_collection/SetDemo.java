package j49_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//Set集合
public class SetDemo {
    public static void main(String [] args){
        Set<String> hash = new HashSet<String>();
        Set<String> tree = new TreeSet<>();
        tree.add("hell");
        tree.add("wamg");
        tree.add("dsa");
        tree.add("wamg");

        System.out.println(tree);
    }
}
