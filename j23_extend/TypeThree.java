package j23_extend;

//类型转换
public class TypeThree {
    public static void main(String args[]){
        String str = "123"; //若不是数字组成 NumberFormatException
        int temp = Integer.parseInt(str);
        String stra = "true";
        boolean t = Boolean.parseBoolean(stra);

        String c = 23+"";
        String a = String.valueOf(23);//这种方式转换不会产生垃圾


    }
}
