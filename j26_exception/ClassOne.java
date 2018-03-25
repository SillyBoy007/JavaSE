package j26_exception;

public class ClassOne {
    public static void main(String args[]){
        System.out.println(1);
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
             e.printStackTrace();//异常信息完整输出
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//异常信息完整输出
        }catch (NumberFormatException e){
            e.printStackTrace();//异常信息完整输出
        }
        finally {
            System.out.println("无论怎么样都执行");
        }
        System.out.println(2);
    }
}
