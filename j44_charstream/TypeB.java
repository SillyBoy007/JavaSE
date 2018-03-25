package j44_charstream;

import java.io.*;

//字符输入流
public class TypeB {
    public static void main(String [] args) throws IOException {
        File file = new File("D:"+File.separator+"demo"+File.separator+"test.txt");
        if (file.exists()){
            Reader in = new FileReader(file);
            char data[] = new char[1024];
            int len = in.read(data);
            in.close();
            System.out.println(new String(data,0,len));
        }
    }
}
