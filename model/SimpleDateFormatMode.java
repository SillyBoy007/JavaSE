package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//将日期格式化显示(String)
public class SimpleDateFormatMode {
    public static void main(String [] args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str = sdf.format(date);  //将Date转换为String
        System.out.println(str);
        String str2 = "2003-11-12 12:12:12.123";
        Date date2 = null;
        try {
            date2 = sdf.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date2);
    }
}
