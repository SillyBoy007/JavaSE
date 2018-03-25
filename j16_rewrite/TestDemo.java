package j16_rewrite;

class A{
    public void fun(){
        System.out.println("A中的fun方法");
    }

}
class B extends A{
    public void fun(){ //重写
        super.fun(); //执行父类方法
        System.out.println("B中的fun方法");
    }
}
public class TestDemo {
    public static void main(String args[]){
        B b = new B();
        b.fun();
    }
}
