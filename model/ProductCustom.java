package model;

//生产者与消费者,多线程处理模型
class Info {
    private String title;
    private String content;
    private boolean flag = true; //flag = true表示可以生产但不可以取走,flag=false 可以取走不可以生产
    public synchronized  void set(String title,String content){
        if (this.flag == false){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false; //修改生产标记
        super.notify(); //唤醒其它等待线程
    }
    public synchronized void get(){
        if (this.flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title+'-'+this.content);
        this.flag = true;
        super.notify();
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

}
class Productor implements Runnable{
    private Info info;
    public Productor (Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for (int x=0;x<100;x++){
            if (x % 2 == 0){
                this.info.set("wang","帅");
            }else{
                this.info.set("xia","rich");
            }
        }
    }
}

class Customer implements Runnable{
    private Info info;
    public Customer(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for (int x=0;x<200;x++){
           this.info.get();
        }
    }
}
public class ProductCustom {
    public static void main(String [] args){
        Info info = new Info();
        new Thread(new Productor(info)).start();
        new Thread(new Customer(info)).start();
    }
}
