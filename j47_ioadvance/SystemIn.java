package j47_ioadvance;

import java.io.IOException;
import java.io.InputStream;

//用户输入
public class SystemIn {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
       // byte [] data = new byte[]{};
        StringBuffer sb = new StringBuffer();
        System.out.println("请输入数据:");
        int temp = 0;
        while ((temp = input.read()) != -1){
            if(temp == '\n'){  //换行符中断程序
               break;
            }
            sb.append((char)temp); //将ASCII转化为字符
        }
       // int len = input.read(data);
        System.out.println("输入的数据为:"+sb);
    }
}
