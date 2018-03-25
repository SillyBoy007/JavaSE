package j10_objectthan;
//对象比较
//对象比较是某一个类自己定义的功能
//对象比较时要判断是否为空/地址是否相同/属性是否相同
class Book{
    private String title;
    private double price;
    public Book(String title,double price){
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean compare(Book book){ //对象比较,本类接受本类对象
        if(book == null){
            return false;
        }
        if (book == this){
            return true;
        }
        if (this.title.equals(book.title) && this.price == book.price){
            return true;
        }else{
            return false;
        }
    }
}
public class ObjectThan {
    public static void main(String args[]){
        Book bk1 = new Book("js",12.00);
        Book bk2 = new Book("js",12.00);
        Book bk3 = new Book("jsp",12.00);
        Book bk4 = null;
        if(bk1.compare(bk4)){
            System.out.println("是同一对象");
        }else{
            System.out.println("不是同一对象");
        }
    }
}
