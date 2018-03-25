package j51_stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//输出属性内容
public class PropertiesOut {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("bj","北京");
        pro.setProperty("tj","天津");
        File file = new File("d:"+File.separator+"demo"+File.separator+"pro.properties");
        FileOutputStream fos = new FileOutputStream(file);
        pro.store(fos,"AreaInfo");



    }
}
