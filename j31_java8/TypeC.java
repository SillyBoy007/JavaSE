package j31_java8;

//引用静态方法
/**
 * 实现方法的引用接口
 * @param <P>引用方法参数的类型
 * @param <R>引用方法返回的类型
 */

//功能型接口
interface IMessage<P,R>{
    public R change(P p);
}
public class TypeC {
    public static void main(String [] args){
        //即:将String.valueOf()方法变为了IMessage接口里的change()方法
         IMessage<Integer,String> msg = String :: valueOf;
         String str = msg.change(1000);
         System.out.println(str.replaceAll("0","9"));

    }
}
