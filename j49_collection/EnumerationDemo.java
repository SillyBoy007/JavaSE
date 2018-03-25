package j49_collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String [] args){
        Vector<String> all = new Vector<>();
        all.add("A");
        all.add("B");
        all.add("C");
        Enumeration<String> enuma = all.elements();
        while (enuma.hasMoreElements()){
            String str = enuma.nextElement();
            System.out.println(str);
        }

    }
}
