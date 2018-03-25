package j46_printstream;

import java.io.*;

class PrintUtil{ //专门实现输出操作,可以输出各种类型
    private OutputStream output;
    public PrintUtil(OutputStream output){
        this.output = output;
    }
    public void print(int x){
        this.print(String.valueOf(x));
    }
    public void print(String x){
        try {
            this.output.write(x.getBytes());//将字符串转化为字符数组
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(double x){
        this.print(String.valueOf(x));
    }
    public void println(int x){
        this.println(String.valueOf(x));
    }
    public void println(String x){
        this.print(x.concat("\r\n"));
    }
    public void println(double x){
        this.println(String.valueOf(x));
    }
    public void close(){
        try {
            this.output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class TypeA {
    public static void main(String [] args) throws FileNotFoundException {
        PrintUtil pru = new PrintUtil(new FileOutputStream(new File("D:"+File.separator+"demo"+File.separator+"my.txt")));
        pru.println("hello");
        pru.println(1+1);
        pru.println(2.33+6.22);
        pru.close();
    }
}
