package j20_abstract;

abstract class A{
    public  void fun(){}
    public abstract void print();  //抽象方法
}
class B extends A{
    public void print(){
        System.out.println("hello");
    }
}

public class TypeOne {
    public static void main(String args[]){
        A a = new B(); //向上转型
        a.print();
    }
}
