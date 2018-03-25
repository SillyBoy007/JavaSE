package j12_block;
//构造块,写在类中的代码块
//构造块优先于构造方法执行

class Book{
    public Book(){
        System.out.println("[a]构造方法");
    }
    {
        System.out.println("[b]构造块");
    }
}
public class ConBlock {
    public static void main(String args[]){
        Book ba = new Book();
        Book bb = new Book();
    }
}
