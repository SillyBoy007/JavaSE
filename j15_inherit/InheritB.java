package j15_inherit;

class A{
    private String msg;
    public A(){
        System.out.println("A类构造方法执行");
    }
    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
class B extends A{

    public B(){
        System.out.println("B类构造方法执行");
    }
}
public class InheritB {
    public static void main(String args[]){
        B b = new B(); //默认调用父类无参构造，隐含super()
        System.out.println(b.getMsg());
    }
}
