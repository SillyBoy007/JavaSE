package j32_lightweight;

//Thread实现多线程，单继承
class MyThread extends Thread{ //一个多线程的操作类，线程中的主类
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run(){  //线程一旦开始就要一直执行，不能够返回内容,复写run方法,作为线程的主体操作方法
        for (int x=0;x<100;x++){
            System.out.println(this.name+"-->"+x);
        }
    }
}
public class TypeA { //主类
    public static void main(String args[]){
        MyThread mt1 = new MyThread("线程A");
        MyThread mt2 = new MyThread("线程B");
        MyThread mt3 = new MyThread("线程C");

        mt1.start();   //启动线程,各个线程抢占资源
        mt2.start();
        mt3.start();
    }
}
