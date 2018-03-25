package j15_inherit;

class C{
    private String msg;
    public C(){}
    public C(String msg){
        System.out.println("A类构造方法执行");
    }
    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
class D extends C{
    public D(){
        System.out.println("子类无参数构造");
    }
    public D(String msg){
        super(msg);  //由子类调用父类的构造方
        System.out.println("B类构造方法执行");
    }
}
public class Super {
    public static void main(String args[]){
        D b = new D("123");
       // System.out.println(b.getMsg());
    }
}
