package j16_rewrite;

class E {
    private String info="hello";
}
class F {
    private String info="hah";
    public void print(){
        System.out.println(this.info);
    }
}
public class Proto {
    public static void main(String args[]){
        F f = new F();
        f.print();
    }
}
