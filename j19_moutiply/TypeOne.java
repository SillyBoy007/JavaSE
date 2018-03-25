package j19_moutiply;

class A{
    public void print(){
        System.out.println("A");
    }
}
class B extends A{
    public void print(){
        System.out.println("B");
    }
    public void fun(){
        System.out.println("B的特殊方法");
    }
}
class C extends A{
    public void print(){
        System.out.println("C");
    }

}
public class TypeOne {
    public static void main(String args[]){
        A a = new B();  //向上转型
        A a1 = new C(); //向上转型
        B b = (B)a; //向下转型

        a.print();
        a1.print();
        b.print();
        b.fun();
    }
}
