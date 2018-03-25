package j31_java8;

//消费型接口
//引用某个对象的方法
@FunctionalInterface //此为函数式接口,只能够定义一个方法
interface IMessageA<R>{
    public R upper();
}
public class TypeD {
    public static void main(String [] args){
        //将toUpperCase方法交给了接口
        IMessageA<String> msg = "hello" :: toUpperCase;
        String str = msg.upper();
        System.out.println(str);
    }
}
