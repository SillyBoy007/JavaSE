package j21_interface;
//代理设计模式
interface Subject{ //操作的核心
    public void make();
}
class RealSubject implements Subject{
    public void make(){
        System.out.println("核心操作");
    }
}

class ProxySubject implements Subject{


    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject = subject;
    }
    public void prepare(){
        System.out.println("准备操作");
    }
    public void make(){
        this.prepare();
        this.subject.make(); //调用核心操作
        this.destory();
    }
    public void destory(){
        System.out.println("销毁操作");
    }
}
public class Proxy {
    public static void main(String args[]){
        Subject sub = new ProxySubject(new RealSubject());
        sub.make();
    }
}
