package j12_block;
//静态块,非主类中使用
//优先于构造块执行
//不管实例化多少对象,只执行一次
//若静态块在主类中使用,优先于主方法执行
class BookA{
    public BookA(){
        System.out.println("[a]构造方法");
    }
    {
        System.out.println("[b]构造块");
    }
    static {
        System.out.println("[c]静态块");
    }
}
public class StaticBlock {
    public static void main(String args[]){
        new BookA();
        new BookA();
    }
}
