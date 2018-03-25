package j22_object;
//
class BookA extends Object{
    private String title;
    private double price;
    public BookA(String title,double price){
        this.title = title;
        this.price = price;
    }
    public String toString(){ //直接调用对象
        return "书名:"+this.title+"\n"+"价格:"+this.price;
    }

}
public class toString {
    public static void main(String args[]){
        BookA b = new BookA("js",20.0);
        String c = "hello";
        System.out.println(b.toString());
        System.out.println(b); //默认调用

    }
}
