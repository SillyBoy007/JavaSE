package j19_moutiply;

class D{
    public void print(){
        System.out.println("D");
    }
}
class E extends D{
    public void print(){
        System.out.println("E");
    }
    public void fun(){
        System.out.println("E的特殊方法");
    }
}
public class TypeTwo {
    public static void main(String args[]){
        D f = new E();
        System.out.println(f instanceof E);
        System.out.println(f instanceof D);

        if (f instanceof E){
            E e = (E)f;
            e.print();
        }
    }
}
