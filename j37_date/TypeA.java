package j37_date;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Date;

//Date类
public class TypeA {
    public static void main(String [] args){
        Date date = new Date();
        System.out.println(date);//输出当前日期

        long date2 = date.getTime(); //将date日期转换为long
        System.out.println(date2);

        Date date3 = new Date(date2); //将long转换为date日期
        System.out.println(date3);



    }
}
