package j39_regexp;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

//字符串匹配
public class TypeA {
    public static void main(String [] args){
        String str = "123";
        System.out.println(isNumber(str));
        System.out.println(str.matches("\\d+"));//正则
    }
    public static boolean isNumber(String temp){
        char [] data = temp.toCharArray();
        for (int x=0;x<data.length;x++){
            if (data[x]>'9' || data[x]<'0'){
                    return false;
            }
        }
        return true;
    }
}
