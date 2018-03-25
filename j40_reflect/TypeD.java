package j40_reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//反射调用构造方法
class MyBook{
    private String title;
    private double price;

    public MyBook(String title,double price){
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "图书:"+this.title+",价格"+this.price;
    }
}
public class TypeD {
    public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = Class.forName("j40_reflect.MyBook");
        Constructor<?> con = cls.getConstructor(String.class,double.class); //反射调用构造方法
        Object obj = con.newInstance("java",23.00); //实例化对象
        System.out.println(obj);
    }
}
