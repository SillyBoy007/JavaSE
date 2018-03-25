package j39_regexp;

//判断给定字符串是否是ip地址
public class TypeC {
    public static void main(String [] args){
        String str = "192.168.0.1";
        String regex = "(\\d{1,3}\\.){3}\\d{1,3}";
        System.out.println(str.matches(regex));
    }
}
