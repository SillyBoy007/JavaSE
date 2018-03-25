package j28_genericity;
//
class Point{
    private Object x;
    private Object y;
    public Point(){}
    public Point(Object x,Object y){
        this.x = x;
        this.y = y;
    }
    public void setX(Object x){
        this.x = x;
    }

    public Object getX() {
        return x;
    }
    public void setY(Object y){
        this.y = y;
    }

    public Object getY() {
        return y;
    }
}
public class TypeOne {
    public static void main(String args[]){
        Point p = new Point();
        p.setX(10);
        String a = (String) p.getX(); //类转换异常
        System.out.println(a+10);
    }
}
