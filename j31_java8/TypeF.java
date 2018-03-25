package j31_java8;

//供给型接口
//引用构造方法
@FunctionalInterface
interface IMessageC<C>{
    public C create(String t,double p);
}
class Book{
    private String title;
    private double price;
    public Book(String title,double price){
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString() {
        return "书名:"+this.title+",价格:"+this.price;
    }
}
public class TypeF {
    public static void main(String [] args){
        IMessageC<Book> msg = Book :: new;
        Book book = msg.create("js",23.00);//实例化对象
        System.out.println(book);
    }
}
