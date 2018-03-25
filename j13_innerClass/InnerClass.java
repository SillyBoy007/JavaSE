package j13_innerClass;

//内部类可以方便地访问外部类的私有属性
//外部类可以方便地访问内部类的私有属性
//在外面实例化内部类之前要先实例化外部类
//若内部类前加上private,则无法在外部实例化

import java.security.PrivateKey;

class Outer{
    private String msg = "Hello world";
    class Inner{
        private String info= "哈哈哈哈";
        public void print(){
            System.out.println(Outer.this.msg);
        }
    }
    public void fun(){
        Inner inner = new Inner();
        inner.print();
        System.out.println(inner.info);
    }
}
public class InnerClass {
    public static void main(String args[]){
        Outer out = new Outer();
        out.fun();
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner);
    }
}
