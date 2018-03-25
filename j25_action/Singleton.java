package j25_action;
//单例设计模式
class MySingleton{
    private static final MySingleton INSTANCE = new MySingleton();
    public static MySingleton getSingleton(){ //控制实例化对象产生个数
        return INSTANCE;
    }
    private MySingleton(){}//构造方法私有化
    public void print(){
        System.out.println("hello");
    }
}
public class Singleton {
    public static void main(String args[]){
        MySingleton a = null;
        a = a.getSingleton(); //直接访问static属性
        a.print();
    }
}
