package j13_innerClass;

class OuterB{
    private static String msg = "呵呵";
    public void fun(){
         class InnerB{
            public void print(){
                System.out.println(msg);
            }
         }
         new InnerB().print();
    }
}
public class MethodInner {
    public static void main(String args[]){
        OuterB outerB = new OuterB();
        outerB.fun();
    }
}
