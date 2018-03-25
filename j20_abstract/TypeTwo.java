package j20_abstract;

abstract  class C{
    abstract static class E{
        public  void fun(){}
        public abstract void print();  //抽象方法
    }

}
class D extends C.E{
    public void print(){
        System.out.println("hello");
    }
}
public class TypeTwo {
    public static void main(String args[]){

        C.E c = new D();
        c.print();
    }
}
