package j40_reflect;

//反射调用成员(属性)

import java.lang.reflect.Field;

class City{
    private String cityname;
}
public class TypeF {
    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        String fildName = "cityname";
        Class<?> cls = Class.forName("j40_reflect.City");
        Object obj = cls.newInstance();

        Field titleField = cls.getDeclaredField(fildName);
        titleField.setAccessible(true);//取消封装
        titleField.set(obj,"nignbo");
        System.out.println(titleField.get(obj));
    }
}
