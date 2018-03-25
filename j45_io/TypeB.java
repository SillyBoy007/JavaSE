package j45_io;

import java.io.*;

//内存操作流实现转换,过程中不会产生文件,所有操作都是以内存为终端的
public class TypeB {
    public static void main(String [] args) throws IOException {
        String str = "hello!!!";
        //
        InputStream input = new ByteArrayInputStream(str.getBytes());
        //为了将内存流数据取出
        OutputStream output = new ByteArrayOutputStream();
        int temp = 0; //读取每一个字节
        //经过此次操作后,所有数据都保存在内存输出对象之中
        while ((temp = input.read())!=-1){
            output.write(Character.toUpperCase(temp));
        }
        System.out.println(output);
        input.close();
        output.close();
    }
}
