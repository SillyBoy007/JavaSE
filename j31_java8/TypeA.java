package j31_java8;

interface  Message{
    public void print(); //接口原本定义的方法

    default void fun(){  //在接口里定义普通方法
        System.out.println("java8开始可以在这里定义default方法了");
    }
    static void get(){
        System.out.println("也可以用static声明方法");
    }
}

class MessageImpl implements Message{
    @Override
    public void print() {
        System.out.println("hello");
    }
}
public class TypeA {
    public static void main(String args[]){
        Message msg = new MessageImpl();
        msg.fun();
        Message.get();
    }
}
