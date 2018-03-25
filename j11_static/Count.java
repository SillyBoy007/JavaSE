package j11_static;
//统计实例化对象个数
class BookB{
    private static int num = 0;
    public BookB(){
        num++;
        System.out.println("这是第"+num+"个产生的对象");
    }
}
public class Count {
    public static void main(String args[]){
        new BookB();
        new BookB();
        new BookB();
        new BookB();new BookB();

    }
}
