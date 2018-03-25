package j26_exception;

class Mymath{
    public static  int div(int x,int y) throws Exception{ //交由被调用处
        return x/y;
    }
}
public class Throws {
    public static void main(String args[]) throws Exception{ //主方法的异常会直接通过主方法抛出给JVM
        try {
            System.out.println(Mymath.div(10,0));
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hehe");
    }
}
