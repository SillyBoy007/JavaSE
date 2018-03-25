package j45_io;

import java.io.*;

public class TypeA {
    public static void main(String [] args) throws IOException {
        File file = new File("D:"+File.separator+"demo"+File.separator+"my.txt");
        OutputStream output = new FileOutputStream(file);
        output.write("啊哈哈哈哈".getBytes("ISO8859-1"));
        output.close();
    }
}
