package j32_lightweight;

//Runnable接口实现多线程,多继承(推荐)

class MyRun implements Runnable{
    private String name;
    public MyRun(String name){
        this.name = name;
    }
    @Override
    public void run(){  //线程一旦开始就要一直执行，不能够返回内容,复写run方法,作为线程的主体操作方法
        for (int x=0;x<100;x++){
            System.out.println(this.name+"-->"+x);
        }
    }
}

public class TypeB {
    public static void main(String args[]){
        MyRun mt1 = new MyRun("线程A");
        Runnable mt2 = new MyRun("线程B");
        Runnable mt3 = new MyRun("线程C");

        new Thread(mt1).start();
        new Thread(mt2).start();
        new Thread(mt3).start();
    }
}
