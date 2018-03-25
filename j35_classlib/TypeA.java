package j35_classlib;
//String Buffer

public class TypeA {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("213"); //String变成StringBuffer
        sb.append("21321").append("world");
        change(sb); //引用传递,StringBuffer类可以改变
        System.out.println(sb);
        String sba = sb.toString();
        fun(sba);
        System.out.println(sba);

        StringBuffer wa = new StringBuffer("wang");
        System.out.println("Wang".contentEquals(wa)); //比较内容
        wa.reverse(); //字符串反转
        System.out.println(wa);
        wa.insert(2,"hehe");
        System.out.println(wa);
        wa.delete(2,4); //删除部分内容
        System.out.println(wa);

    }
    public static void change(StringBuffer temp){
        temp.append("\n").append("hello MAN");
    }
    public static void fun(String temp){
        temp.concat("hello");
    }
}
