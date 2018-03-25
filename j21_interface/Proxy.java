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
<<<<<<< HEAD
class ProxySubject implements Subject{
=======
class ProxySubject implements  Subject{
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
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
