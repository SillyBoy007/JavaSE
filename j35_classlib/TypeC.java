package j35_classlib;

import java.io.IOException;

//调用本机可执行程序
public class TypeC {
    public static void main(String [] args){
        Runtime rt = Runtime.getRuntime();
        try {
            Process pr = rt.exec("mspaint.exe"); //打开画板,开启进程
            Thread.sleep(2000);
            pr.destroy();//销毁进程
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
