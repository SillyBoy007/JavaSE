package j49_collection;

import java.util.ArrayList;
import java.util.List;

//ArrayList中的元素删除,需要增加equals方法
class Book{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名:"+this.title+"价格:"+this.price+"\n";
    }


}
public class ArrayListObj {
    public static void main(String [] args){
        List<Book> all = new ArrayList<>();
        all.add(new Book("java开发",23.00));
        all.add(new Book("js",33.00));
        all.add(new Book("python",43.00));
        //任何情况下集合数据的删除与内容查询必须提供equals()方法
        all.remove(new Book("js",33.00));
        System.out.println(all);
    }
}
