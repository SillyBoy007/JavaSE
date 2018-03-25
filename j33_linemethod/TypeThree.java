package j33_linemethod;

//线程的优先级
public class TypeThree {
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getPriority()); //主线程的优先级是中等优先级
        MythreadA mt1 = new MythreadA();
        Thread t1 = new Thread(mt1,"线程A");
        Thread t2 = new Thread(mt1,"线程B");
        Thread t3 = new Thread(mt1,"线程C");
        t1.setPriority(Thread.MAX_PRIORITY); //MAX_PRIORITY值是10
        t2.setPriority(Thread.MIN_PRIORITY);//MIN_PRIORITY值是1
        t3.setPriority(Thread.NORM_PRIORITY);//NORM_PRIORITY是5
        t1.start();
        t2.start();
        t3.start();


    }
}
