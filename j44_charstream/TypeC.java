package j44_charstream;

import java.io.*;
//OutputStream和Writer的转换
public class TypeC {
    public static void main(String [] args) throws IOException {
        File file = new File("D:"+File.separator+"demo"+File.separator+"test.txt");
        if (!file.getParentFile().exists()){
            file.mkdirs();
        }
        OutputStream output = new FileOutputStream(file);
        Writer out = new OutputStreamWriter(output);
        out.write("Hello world!"); //writer
       // out.flush(); //清空缓存区
        out.close();
    }
}
