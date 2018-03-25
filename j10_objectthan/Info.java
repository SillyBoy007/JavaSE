package j10_objectthan;
//本类接收本类对象
class  Test{
    private String msg = "hello";
    public void print(){
        System.out.println("msg=" + msg);
    }
    public void fun(Test temp){  //接收本类对象
        temp.msg = "修改内容";
    }
}
public class Info {
    public static void main(String args[]){
        Test x = new Test();
        x.fun(x); //这里修改了私有变量
        x.print();
    }
}
