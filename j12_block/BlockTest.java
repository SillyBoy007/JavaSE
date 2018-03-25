package j12_block;
//普通代码块，写在方法里的代码块
public class BlockTest {
    public static void main(String args[]){
        {
            int num = 10;
            System.out.println(num);
        }

        int num = 100;
        System.out.println(num);
    }
}
