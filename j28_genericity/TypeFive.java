package j28_genericity;
//泛型接口

interface IMessage<T>{
    public void print(T t);
}
//子类使用和父类相同的泛型
class MessageImpl<T> implements IMessage<T>{
    public void print(T t){
        System.out.println(t);
    }
}
//子类设置父类的泛型
class MessageImpl2 implements IMessage<String>{
    public void print(String t){
        System.out.println(t);
    }
}
public class TypeFive {
    public static void main(String args[]){
            IMessage<Integer> im= new MessageImpl<>();
            im.print(123);
            IMessage<String> im2= new MessageImpl2();
            im2.print("23");
    }
}
