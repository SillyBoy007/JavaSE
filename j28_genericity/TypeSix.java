package j28_genericity;

public class TypeSix {
    public static void main(String args[]){
        String str = fun("hello");
        System.out.println(str.length());
    }
    public static <T> T fun(T t){
        return t;
    }
}
