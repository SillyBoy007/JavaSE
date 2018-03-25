package j51_stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"A","B","C");
        Collections.reverse(all);
        System.out.println(all);

    }
}
