package model;

class MyMath{
    public static int div(int x ,int y) throws Exception{  //交给被调用处处理
        int result = 0;
        System.out.println("计算开始");
        try {
            result = x/y;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("计算结束");
        }
        return result;
    }
}

public class MyException {
    public static void main(String args[]){
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
