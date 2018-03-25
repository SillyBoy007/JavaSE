package j21_interface;

interface A{ //定义接口
    public static final String MSG="hello,world"; //全局常量
    public abstract void print(); //抽象方法
}
interface B{ //接口B
    public abstract void get();
}
abstract class C{
    public abstract void change();
}

class X extends C implements A,B{  //先继承后实现接口
    public void print(){
        System.out.println("A的抽象方法");
    }
    public void get(){
        System.out.println("B的抽象方法");
    }
    public void change(){
        System.out.println("C的抽象方法");
    }
}
public class TypeOne {
    public static void main(String args[]){
        X x = new X();
        A a  = x; //向上转型
        B b  = x;
        a.print();
        b.get();
    }
}
