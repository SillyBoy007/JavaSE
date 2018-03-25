package j34_linesync;


//死锁
class A{
    public synchronized void say(B b){
        System.out.println("sda");
    }
    public synchronized void get(B b){
        System.out.println("My");
    }
}
class B{
    public synchronized void say(A a){
        System.out.println("let you book");
    }
    public synchronized void get(){
        System.out.println("get pens ");
    }
}

public class TypeD implements Runnable{
    private static  A a = new A();
    private static  B b = new B();
    public static void main(String [] args){
        new TypeD();
    }
    @Override
    public void run() {
        a.say(b);
    }
    public TypeD(){
        new Thread(this).start();
        b.say(a);
    }
}
