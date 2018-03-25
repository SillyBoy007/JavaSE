package j38_than;

import j22_object.Array;

import java.util.Arrays;
import java.util.Comparator;

//对象数组比较器
class Book implements Comparable<Book>{
    private String title;
    private double price;



    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名:"+this.title+",价格:"+this.price;
    }

    @Override
    public int compareTo(Book o) {
        if (this.price > o.price){
            return -1;
        } else if(this.price < o.price){
            return  1;
        }else {
            return 0;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


class BookComparator implements Comparator<Book>{ //专门为Book排序类
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() < o2.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}
public class TypeB {
    public static void main(String [] args){
        Book [] books = new Book[]{
            new Book("jsp",43.00),
            new Book("js",23.00),
            new Book("java",33.00),

        };

        //Arrays.sort(books);  //若没有实现Comparable接口重写compareTo方法会出现ClassCastException
        Arrays.sort(books,new BookComparator());
        System.out.println(Arrays.toString(books));
    }
}
