package j40_reflect;

import java.util.Date;

public class TypeA {
    public static void main(String [] args) throws ClassNotFoundException {
        Date date = new Date(); //产生对象
        System.out.println(date.getClass()); //取得完整类(对象的出处)
        Class<?> cls = date.getClass(); //第一种class对象实例化
        System.out.println(cls);
        Class<?> cls2 = Date.class;//第二种class对象实例化
        System.out.println(cls2);
        Class<?> cls3 = Class.forName("java.util.Date");//第三种class对象实例化,可以不导入java.util.date包
        System.out.println(cls3);

    }
}
