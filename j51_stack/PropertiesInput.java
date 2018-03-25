package j51_stack;

import java.io.*;
import java.util.Properties;

public class PropertiesInput {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        File file = new File("d:"+File.separator+"demo"+File.separator+"pro.properties");
        FileInputStream fos = new FileInputStream(file);
        pro.load(fos);
        System.out.println(pro.getProperty("tj"));
    }
}
