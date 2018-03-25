package j39_regexp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//判断年月日
public class TypeD {
    public static void main(String [] args){
        String str = "2013-03-12";
        String regex = "\\d{4}(-\\d{1,2}){2}";
        System.out.println(str.matches(regex));
        if (str.matches(regex)){
            Date date = null;
            try {
                 date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date);
        }else{
            System.out.println("不是正确的日期");
        }
    }
}
