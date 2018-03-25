package j29_enum;

enum ColorB{
    RED("红色"),YELLO("黄色"),BLUE("蓝色");
    private String title;//属性
    private ColorB(String title){ //构造方法不能用public声明
        this.title = title;
    }

    public String toString() {
        return this.title;
    }
}
public class TypeThree {
    public static void main(String args[]){
        for (ColorB b: ColorB.values()){
            System.out.println(b.toString());
        }
    }
}
