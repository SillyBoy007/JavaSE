package j31_java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class TypeG {
    public static void main(String args[]){
        Function<String,Boolean> fun = "##hello"::startsWith; //函数式接口判断是否是##开头
        System.out.println(fun.apply("##"));

        Consumer<String> cons = System.out :: println;//消费型接口
        cons.accept("hello");

        Supplier<String> sup = "hello" :: toUpperCase;  //供给型接口
        System.out.println(sup.get());

        Predicate<String> pre = "hello" :: equalsIgnoreCase;
        System.out.println(pre.test("hEllo"));

    }
}
