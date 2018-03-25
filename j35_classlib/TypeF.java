package j35_classlib;

//对象克隆
class Book implements Cloneable{
    private String title;
    private double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "书名:"+this.title+"价格:"+this.price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TypeF {
    public static void main(String args[]) throws CloneNotSupportedException {
        Book b = new Book("js",32.00);
        Book c = new Book("java",323.00);
        c = (Book) b.clone();
        System.out.println(c);

    }
}

