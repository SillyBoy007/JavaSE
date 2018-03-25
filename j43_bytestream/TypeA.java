package j43_bytestream;

import java.io.*;

//字节输出流
public class TypeA {
    public static void main(String [] args) throws IOException {
        File file = new File("D:"+File.separator+"test"+File.separator+"my.txt"); //定义输出文件路径
        if (!file.getParentFile().exists()){ //
            file.getParentFile().mkdirs();
        }

        //使用OutputStream和其子类进行实例化
        OutputStream os = new FileOutputStream(file,true);//FileOutputStream 内容内容追加

        String str = "hello,汪\r\n";//\r\n换行
        byte [] data = str.getBytes(); //将字符串变为字节数组
        os.write(data); //字节数组全部输出
        /*for (int x=0;x<data.length;x++){
            os.write(data[x]); //以单个字节输出
        }*/
        //os.write(data,3,4);//输出部分字节
        os.close();

    }
}
