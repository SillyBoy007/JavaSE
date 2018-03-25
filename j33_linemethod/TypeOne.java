package j33_linemethod;

//线程的命名与取得
class Mythread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class TypeOne {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String [] args){
        Mythread mt1 = new Mythread();

        new Thread(mt1,"线程A").start();
        new Thread(mt1).start();
        new Thread(mt1).start();
        mt1.run(); //输出main 主方法是main线程

    }
}
