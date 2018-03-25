package model;

import java.io.*;

//文件拷贝
public class FileCopy {
    public static void main(String [] args) throws IOException {
        long start = System.currentTimeMillis();
        if (args.length != 2){ //初始化不足俩位
            System.exit(1);//程序运行错误
        }
        //输入的文件进行验证
        File inFile = new File(args[0]); //第一个是源文件路径
        if (!inFile.exists()){
            System.out.println("源文件不存在请确认执行路径");
            System.exit(1);
        }

        File outFile = new File(args[1]);
        if (!outFile.getParentFile().exists()){ //若输出文件路径不存在
            outFile.getParentFile().mkdirs(); //创建
        }

        //实现拷贝
        InputStream input = new FileInputStream(inFile);
        OutputStream output = new FileOutputStream(outFile);
        //实现文件拷贝
        int temp = 0;
        byte[] data = new byte[1024]; //每次读取单个字节
        /*while ((temp = input.read())!= -1){  //每次读取单个字节  //单个读取花费时间长
            output.write(temp);  //输出单个字节
        }*/
        while ((temp = input.read(data))!= -1){  //每次读取的数据,返回读取个数
            output.write(data,0,temp);  //输出数组
        }
        input.close();
        output.close();
        long end = System.currentTimeMillis();
        System.out.println("拷贝花费时间:"+(end - start));
    }
}
