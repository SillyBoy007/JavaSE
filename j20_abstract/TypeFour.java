package j20_abstract;

abstract class H {
    public H(){  //2.调用构造方法
        this.print();   //3.调用print方法
    }
    public abstract void print();
}
class I extends H{
    private int num = 100;
    public I(int num){
        this.num = num;
    }
    public void print(){    //4.调用重写后的方法,此时num还未初始化
        System.out.println(this.num);
    }

}
public class TypeFour {
    public static void main(String args[]){
        H h = new I(30); //1.执行构造
        h.print();
    }
}
