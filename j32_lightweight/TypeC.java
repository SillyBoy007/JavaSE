package j32_lightweight;

//两种多线程对比
/*class Mythread extends Thread{
    private int ticket = 10;
    @Override
    public void run(){
        for (int x=0;x<10;x++){
            System.out.println("卡的数量"+ticket--);
        }
    }
}*/
class Mythread implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println("卡的数量" + ticket--);
        }
    }
}
public class TypeC {
    public static void main(String [] args){
        Mythread mt1 = new Mythread();
        Mythread mt2 = new Mythread();
        Mythread mt3 = new Mythread();

       /* mt1.start();  //不存在数据共享概念
        mt2.start();
        mt3.start();*/


        new Thread(mt1).start(); //此时三个线程对象直接占用了Mythread对象的引用
        new Thread(mt1).start(); //三个线程类访问同一个数据资源
        new Thread(mt1).start();

    }
}
