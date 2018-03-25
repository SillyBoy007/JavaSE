package j28_genericity;

//通配符下限
class MessageA<T>{
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }
    public T getMsg(){
        return this.msg;
    }
}
public class TypeFour {
    public static void main(String args[]){
        MessageA<String> ma = new MessageA<String>();
        MessageA<Object> mb = new MessageA<Object>();
    }
    public static void fun(MessageA<? super String> temp){  //通配符下限，只能接收String和String的父类
        System.out.println(temp.getMsg() instanceof Integer);
    }
}
