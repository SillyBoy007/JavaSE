package j52_stream;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("hell");
        all.add("nih");
        all.add("eh");
        all.forEach(System.out :: println);
    }
}
