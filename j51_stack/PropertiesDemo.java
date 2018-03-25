package j51_stack;

import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BJ","北京");
        pro.setProperty("TJ","天津");
        System.out.println(pro.getProperty("TJ"));
        System.out.println(pro.getProperty("AJ","这是默认值"));
    }

}
