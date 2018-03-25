package j11_static;
//static定义属性
//staic的属性存放在全局数据区
//static可以由类名称直接调用
//static属性在没有实例化对象产生时，依然可以使用
//需要描述共享信息用static
class Book{
    private String title;
    private double price;
    static String pub = "清华大学出版社";
    public Book(String title,double price){
        this.title = title;
        this.price = price;
    }

    public String getInfo(){
        return "书名:"+this.title+"价格:"+this.price+"出版社:"+this.pub;
    }
}
public class StaticPro {
    public static void main(String args[]){
        System.out.println(Book.pub);
        Book bka = new Book("js",12.00);
        Book bkb = new Book("java",22.00);
        Book.pub = "北京大学出版社";
        System.out.println(bka.getInfo());
        System.out.println(bkb.getInfo());
    }
}
