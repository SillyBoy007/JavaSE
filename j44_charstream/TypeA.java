package j44_charstream;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//字符输出流
public class TypeA {
    public static void main(String [] args) throws IOException {
        File file = new File("D:"+File.separator+"demo"+File.separator+"test.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //实例化Write对象
        Writer wt = new FileWriter(file);
        //内容输出
        String str = "呵呵呵呵,呵呵呵呵,呵呵呵呵";
        wt.write(str);
        wt.close();
    }
}
