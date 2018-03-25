package j16_rewrite;

class C{
    public void fun(){
        print();
    }
    private void print(){
        System.out.println("C中的print方法");
    }

}
class D extends C{
    public void print(){ //重写
        System.out.println("D中的prin方法");
    }
}
public class TypeTwo {
    public static void main(String args[]){
        D d = new D();
        d.fun();
    }
}
