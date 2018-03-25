package j33_linemethod;

//线程
class MythreadA implements Runnable{
    @Override
    public void run() {
        for (int x=0;x<100000;x++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+",x="+x);
        }
    }
}
public class TypeTwo {
    public static void main(String [] args){
        MythreadA mt= new MythreadA();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
