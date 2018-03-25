package j28_genericity;
//通配符
class Message<T extends Number>{
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }
    public T getMsg(){
        return this.msg;
    }
}
public class TypeThree {
    public static void main(String args[]){
        Message<Integer> m = new Message<>();
        m.setMsg(123);
        fun(m);
    }
    public static void fun(Message<?> temp){  //通配符，能接受任何泛型，但不允许改变泛型
        System.out.println(temp.getMsg() instanceof Integer);
    }
    public static void funB(Message<? extends Number> temp){  //
        System.out.println(temp.getMsg() instanceof Integer);
    }
}
