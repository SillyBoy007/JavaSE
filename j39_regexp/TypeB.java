package j39_regexp;

public class TypeB {
    public static void main(String [] args){
        String str = "aweDSeaFDS**()324__=---BBbdC";
        String reg = "[^a-z]";
        System.out.println(str.replaceAll(reg,""));//将所有非小写去除
    }
}
