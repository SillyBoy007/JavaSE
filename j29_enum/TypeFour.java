package j29_enum;

import j4_private.Private;
//枚举定义接口
interface Message{
    public String getTitle();
}

enum ColorC implements Message{
    RED("红色"),YELLO("黄色"),BLUE("蓝色");
    private String title;
    private ColorC(String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
    public String getTitle(){
        return this.title;
    }
}
//枚举实现接口
public class TypeFour {
    public static void main(String args[]){
        Message msg = ColorC.RED;
        System.out.println(msg);
    }
}
