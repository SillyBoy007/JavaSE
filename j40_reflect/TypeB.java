package j40_reflect;

//反射实现对象实例化操作
class Book{
    public Book(){
        System.out.println("**********************实例化构造方法********************");
    }

    @Override
    public String toString() {
        return "这是一本书";
    }
}
public class TypeB {
    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName("j40_reflect.Book");
        Object obj = cls.newInstance(); //反射实现无参构造实例化
        Book book = (Book) obj;
        System.out.println(book);
    }
}
