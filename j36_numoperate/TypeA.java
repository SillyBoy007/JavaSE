package j36_numoperate;

import java.util.Random;

//数字操作类 Math类 Random类
public class TypeA {
    public static void main(String [] args){
        System.out.println(Math.E); //自然常数
        System.out.println(Math.PI);
        double a = 15.5;
        double b = -15.5;
        System.out.println(Math.round(a));//四舍五入
        System.out.println(Math.round(b));//四舍五入

        Random rd = new Random();
        for (int x=0;x<10;x++){
            System.out.print(rd.nextInt(100)+"、"); //10个 0-100的数字
        }

    }
}
