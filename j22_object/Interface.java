package j22_object;

interface A{
    public void fun();
}
class B implements A{
    public void fun(){
        System.out.println("hehh");
    }
}

public class Interface {
    public static void main(String args[]){
        A a = new B();
        Object object = a; //接收接口
        A t = (A) object;
        t.fun();
    }
}
