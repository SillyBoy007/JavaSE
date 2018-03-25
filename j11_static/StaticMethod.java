package j11_static;
//static方法不能调用非static属性
//若类中没有属性,则可以考虑用static方法
class BookA{
    private String title;
    private double price;
    static String pub = "清华大学出版社";

    public BookA(String title,double price){
        this.title = title;
        this.price = price;
    }
    public static void setPub(String p){
        pub = p;
    }
    public String getInfo(){
        return "书名:"+this.title+"价格:"+this.price+"出版社:"+this.pub;
    }
}
public class StaticMethod {
    public static void main(String args[]){
        BookA.setPub("北京大学"); //在实例化之前调用static方法
        BookA bka = new BookA("js",10.00);
        System.out.println(bka.getInfo());
    }
}
