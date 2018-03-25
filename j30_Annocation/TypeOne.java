package j30_Annocation;
//Override 准确的重写
class Book{
    @Override         //只要正确进行覆写,就不会报错
    public String toString(){
        return "This is a Book";
    }
}
public class TypeOne {
    public static void main(String args[]){
        System.out.println(new Book());
    }
}
