package j28_genericity;

//泛型
class PointA<T>{ //此时的T表示一个标记,在使用时动态设置类型
    private T x;
    private T y;
    public PointA(){}
    public PointA(T x,T y){
        this.x = x;
        this.y = y;
    }
    public void setX(T x){
        this.x = x;
    }

    public T getX() {
        return x;
    }
    public void setY(T y){
        this.y = y;
    }

    public T getY() {
        return y;
    }
}
public class TypeTwo {
    public static void main(String args[]){
        PointA<String> p = new PointA<String>(); //动态设置
        PointA<Integer> pb = new PointA<Integer>(); //基本自动类包装
        pb.setX(123); //此时必须为Integer类,类转换更加安全

    }
}
