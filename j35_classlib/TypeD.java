package j35_classlib;
//System类

//程序执行时间
public class TypeD {
    public static void main(String [] args){

        long start = System.currentTimeMillis();
        String str = "";
        for (int x=0;x<30000000;x++){
            str += "";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start); //毫秒
    }
}
