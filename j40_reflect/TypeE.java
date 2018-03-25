package j40_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//反射调用方法
class TheBook{
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
public class TypeE {
    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String fieldName = "title"; //要操作的成员
        Class<?> cls = Class.forName("j40_reflect.TheBook");
        Object obj = cls.newInstance();//实例化对象
        Method setMet = cls.getMethod("set"+initcap(fieldName),String.class); //取得set方法
        Method getMet = cls.getMethod("get"+initcap(fieldName));
        setMet.invoke(obj,"Java开发");//等价于,Book对象.setTitle("Java开发")
        System.out.println(getMet.invoke(obj));

    }
    public static String initcap(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
