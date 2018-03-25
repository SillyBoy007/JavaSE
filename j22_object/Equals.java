package j22_object;

class BookB{
    private String title;
    private double price;

    public BookB(String title,double price){
        this.title = title;
        this.price = price;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (!(obj instanceof BookB)){ //不是本类对象
            return false;
        }
        BookB book = (BookB) obj;
        if (this.title.equals(book.title) && this.price == book.price){
            return true;
        }
        return false;
    }
}
public class Equals {
    public static void main(String args[]){
        BookB  a= new BookB("js",33.00);
        BookB  b= new BookB("js",33.00);
        System.out.println(a instanceof BookB);
        System.out.println(a.equals(b));
    }
}
