package j34_linesync;

//同步方法实现同步
class MyThreadB implements Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int x=0;x<20;x++){
            this.sale();
        }
    }
    public synchronized void sale(){
        if (this.ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票"+this.ticket --);
        }
    }
}
public class TypeC {
    public static void main(String [] args){
        MyThreadB mt1 = new MyThreadB();
        new Thread(mt1,"票A").start();
        new Thread(mt1,"票B").start();
        new Thread(mt1,"票C").start();
        new Thread(mt1,"票D").start();
    }
}
