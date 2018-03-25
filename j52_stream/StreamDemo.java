package j52_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Java");
        all.add("Android");
        all.add("IOS");
        all.add("ORACLE");
        all.add("jsp");
        Stream<String> stream = all.stream(); //取得stream对象
        //System.out.println(stream.distinct().count()); (流只能打开一次)
        //List<String> newAll = stream.distinct().collect(Collectors.toList()); //取出掉所有重复数据后的List
        //List<String> newAll = stream.distinct().map((x) -> x.toLowerCase()).filter((x) -> x.contains("a")).collect(Collectors.toList()); //帅选选含有"a"或"A的元素
         List<String> newAll = stream.distinct().map((x) -> x.toLowerCase()).skip(2).limit(2).collect(Collectors.toList());
        newAll.forEach(System.out :: println);


    }
}
