package j31_java8;

//lamda表达式
interface MessageA{
    public void print(String str);
}
public class TypeB {
    public static void main(String args[]){
        fun((s)->System.out.println(s));
        fun((s) -> {
            s = s.toUpperCase();
            System.out.println(s);
        });
    }
    public static void fun(MessageA msg){
        msg.print("Hello,world");
    }
}
