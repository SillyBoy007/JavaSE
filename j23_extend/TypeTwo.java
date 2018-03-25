package j23_extend;

//基本数据包装类

//class Integer{ //一个类
//    private int num;
//    public Integer(int num){ //将基本数据类型包装
//        this.num = num;
//    }
//    public int intValue(){
//        return this.num;
//    }
//}
public class TypeTwo {
    public static void main(String args[]){
        Integer a = new Integer(10); //装箱
        System.out.println(a.intValue() * 2);   //拆箱
        boolean b =  false;

        Boolean c = new Boolean(b);
        System.out.println(c.booleanValue());


        Integer obj = 10; //自动装箱
        int e = obj;
        Integer f = new Integer(10); //装箱
        e++;
        System.out.println(e);
        System.out.println(obj.equals(f)); //判断相等用equals

        Object oba = 10;    //自动装箱
        int ccc = (Integer) oba;
        System.out.println(ccc+1);
    }
}
