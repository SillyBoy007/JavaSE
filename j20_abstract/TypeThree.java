package j20_abstract;

abstract class F{

    public abstract void print();

    private static class G extends F{
        public void print(){
            System.out.println("wang");
        }
    }
    public static F getInstance(){
        return new G();
    }
}

public class TypeThree {
    public static void main(String args[]){
        F f = F.getInstance();  //对外部隐藏子类
        f.print();
    }
}
