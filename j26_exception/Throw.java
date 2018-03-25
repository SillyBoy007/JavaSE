package j26_exception;

public class Throw {
    public static void main(String args[]){
        try {
            throw new Exception("自己定义的异常");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
