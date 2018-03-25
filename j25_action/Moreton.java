package j25_action;

//多例设计模式
class Sex{
    private String title;
    private static final Sex MALE = new Sex("男");
    private static final Sex FAMALE = new Sex("女");
    private Sex(String title){ //构造私有化
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
    public static Sex getInstance(int ch){
        switch (ch){
            case 1: return MALE;
            case 2: return FAMALE;
            default:return null;
        }
    }
}
interface Choose{
    public int MAN = 1;
    public int WOMAN = 2;
}
public class Moreton {
    public static void main(String args[]){
        Sex sex = Sex.getInstance(Choose.MAN);
        System.out.println(sex.toString());
    }
}
