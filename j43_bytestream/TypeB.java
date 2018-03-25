package j43_bytestream;

import java.io.*;

//字节输入流
public class TypeB {
    public static void main(String [] args) throws IOException {
        File file = new File("D:"+File.separator+"test"+File.separator+"my.txt");

        if (file.exists()){
            InputStream is = new FileInputStream(file);
            byte[] data = new byte[1024]; //准备一个1024字节数组
            /*int len = is.read(data); //将内容保存到字节数组中*/
           int index = 0; //操作角标
           int temp = 0; //每次读取的字符数据

           while ((temp = is.read())!= -1){ //若temp为-1则结束循环
                data[index++] = (byte) temp;
           }
            is.close(); //关闭
            System.out.println("【"+new String(data,0)+"】");

        }
    }
}
