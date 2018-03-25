package j29_enum;

//枚举

enum ColorA{
    RED,YELLO,BLUE  //此处为实例化对象
}


public class TypeTwo {
    public static void main(String args[]){
        ColorA yello = ColorA.YELLO;
        System.out.println(yello.ordinal());//取得枚举的索引
        System.out.println(yello.name());//取得枚举的名字
        System.out.println(ColorA.values());
    }
}
