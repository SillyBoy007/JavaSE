package j47_ioadvance;

import java.io.*;


//定义一个可以被序列化的类
class Book implements Serializable{  //此类对象可以被序列化
    private transient String title;  //transient不将title序列化
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名:"+this.title+"价格:"+this.price;
    }
}

public class SerializeDemo {
    public static void main(String [] args) throws IOException, ClassNotFoundException {
        //ser();
        dser();
    }
    public static void ser() throws IOException {
        ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream(new File("d:"+File.separator+"demo"+File.separator+"object.txt")));
        oos.writeObject(new Book("Java",76.2)); //对象的序列化
        oos.close();
    }
    public static void dser() throws IOException, ClassNotFoundException {
        ObjectInputStream  ois = new ObjectInputStream(new FileInputStream(new File("d:"+File.separator+"demo"+File.separator+"object.txt")));
        Object object = ois.readObject(); //对象的反序列化
        Book book = (Book) object;
        System.out.println(book);
        ois.close();
    }
}
