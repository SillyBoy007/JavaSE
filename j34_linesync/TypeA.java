package j34_linesync;

//异步的操作
class MyThread implements Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int x=0;x<20;x++){
            try {
                Thread.sleep(100); //延迟0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.ticket > 0){
                System.out.println(Thread.currentThread().getName()+"卖票"+this.ticket --);
            }
        }
    }
}

public class TypeA {
    public static void main(String args[]){
        MyThread mt1 = new MyThread();

        new Thread(mt1,"票贩子A").start(); //多个线程占用同一资源,多个线程对象同时执行run方法,数据发生错误
        new Thread(mt1,"票贩子B").start();
        new Thread(mt1,"票贩子C").start();
        new Thread(mt1,"票贩子D").start();

    }
}
