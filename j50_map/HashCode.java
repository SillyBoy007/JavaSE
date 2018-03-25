package j50_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book{
    private String title;
    private double price;
    public Book(){}
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, price);
    }
}
public class HashCode {
    public static void main(String [] args){
        Map<Book,String> map = new HashMap<>();
        map.put(new Book("java",23.00),"haha");
        System.out.println(map.get(new Book("java",23.00)));
    }
}
