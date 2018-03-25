package j35_classlib;

//Runtime类 内存空间
public class TypeB {
    public static void main(String args[]){
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        String str = "";
        for (int x=0;x<5000;x++){
            str += "";
        }
        rt.gc(); //释放垃圾空间
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
    }
}
