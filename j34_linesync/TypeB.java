package j34_linesync;

//同步代码块实现同步
class MyThreadA implements Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int x=0;x<20;x++){
            synchronized (this){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"卖票"+this.ticket --);
                }
            }
        }
    }
}

public class TypeB {
    public static void main(String [] args){
        MyThreadA mt1 = new MyThreadA();
        new Thread(mt1,"票A").start();
        new Thread(mt1,"票B").start();
        new Thread(mt1,"票C").start();
        new Thread(mt1,"票D").start();

    }
}
