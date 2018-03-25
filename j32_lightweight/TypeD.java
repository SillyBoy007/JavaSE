package j32_lightweight;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

//Callable实现多线程
class MyThreadA implements Callable<String>{
    private int ticket = 10;

    @Override
    public String call() throws Exception {
        for(int x=0;x<10;x++){
            if(this.ticket>0){
                System.out.println("卖票:"+ this.ticket --);
            }
        }
        return "票已买完";
    }
}
public class TypeD {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        MyThreadA mt = new MyThreadA();
        MyThreadA mt2 = new MyThreadA();
        FutureTask<String> task = new FutureTask<> (mt);//取得call的返回结果
        FutureTask<String> task2 = new FutureTask<> (mt2);//取得call的返回结果
        new Thread(task).start();
        new Thread(task2).start();
        System.out.println("A线程的返回结果:"+task.get());
        System.out.println("B线程的返回结果:"+task2.get());

    }
}
