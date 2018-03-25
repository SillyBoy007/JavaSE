package j31_java8;

//断言型接口
//引用特定类的方法
@FunctionalInterface
interface IMessageB<P>{
    public int compare(P p1,P p2);
}
public class TypeE {
    public static void main(String args[]){
        IMessageB<String> msg = String :: compareTo; //方法引用前不再调用对象,将对象定义在参数上
        System.out.println(msg.compare("c","b"));
    }
}
