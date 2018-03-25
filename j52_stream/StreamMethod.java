package j52_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Java");
        all.add("Android");
        all.add("IOS");
        all.add("IOSjsp");
        all.add("ORACLE");
        all.add("jsp");
        Stream<String> stream = all.stream();
        Predicate<String> p1 = (x)->x.contains("jsp");
        Predicate<String> p2 = (x)->x.contains("IOS");
        if (stream.anyMatch((p1.and(p2)))){
            System.out.println("数据存在");
        }
    }
}
