package j23_extend;

//匿名内部类
interface Message{
    public void print();
}

public class TypeOne {
    public static void main(String args[]){
        fun(new Message(){
            public void print(){
                System.out.println("hello");
            }
        });
    }
    public static void fun(Message msg){
        msg.print();
    }
}
