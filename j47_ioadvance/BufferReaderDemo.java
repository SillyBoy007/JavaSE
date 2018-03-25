package j47_ioadvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String [] args) throws IOException {
        //System.in是inputStream类对象
        //BufferedReader构造方法需要接收reader类对象
        //InputStreamReader将字节流变为字符流
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入数据:");
        String str = buf.readLine(); //以回车为换行
        System.out.println("输入内容:"+str);
    }
}
