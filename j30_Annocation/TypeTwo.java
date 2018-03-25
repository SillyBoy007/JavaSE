package j30_Annocation;
//Deprecated声明过期操作
class BookA{
    @Deprecated  //表示该方法已经过时
    public void fun(){
        System.out.println("哈哈哈");
    }
}
public class TypeTwo {
    public static void main(String args[]){
        BookA book = new BookA();
        book.fun();
    }
}
