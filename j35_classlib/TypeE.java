package j35_classlib;

class Member{
    public Member(){
        System.out.println("诞生");
    }

    @Override
    protected void finalize() throws Throwable { //垃圾回收前执行
        super.finalize();
        System.out.println("死亡");
        throw new Exception("继续");
    }
}
public class TypeE {
    public static void main(String args[]){
        Member mb = new Member();
        mb = null;
        System.gc(); //手工处理垃圾
    }
}
