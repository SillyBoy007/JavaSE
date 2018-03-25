package j13_innerClass;
//static内类只可以直接访问外部static方法和属性
//在外部实例化无需先实例化外部类
class OuterA{
    private static String msg = "呵呵";
    static class InnerA{
        public void print(){
            System.out.println(msg);
        }
    }
}
public class StaticInner {
    public static void main(String args[]){
        OuterA.InnerA inner = new OuterA.InnerA();
        inner.print();
    }
}
