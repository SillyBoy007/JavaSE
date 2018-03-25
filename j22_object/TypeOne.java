package j22_object;

//Object是任何类的父类
class Book extends Object{}
public class TypeOne {
    public static void main(String args[]){
        Object oa = new Book();
        Object ob = "Hello";
        Book a = (Book) oa;
        String b = (String) ob;
    }
}
