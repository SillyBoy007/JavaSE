package j9_quote;
//����ʵ���˳���ϵ����
class Member{
    private int mid;
    private String name;
    private Car car; //��ʾ�����˵ĳ�
    private Member child;

    public Member(int mid,String name){
        this.mid = mid;
        this.name = name;
    }

    public void setChild(Member child){
        this.child = child;
    }
    public Member getChild(){
        return this.child;
    }
    public void setCar(Car car){
        this.car = car;
    }

    public Car getCar() {
        return this.car;
    }

    public String getInfo(){
        return  "��Ա���:" + this.mid+"\n"+
                "��Ա����:" + this.name;
    }
}
class Car{
    private String pname;
    private Member member;

    public Car(){}
    public Car(String pname){
        this.pname = pname;
    }
    public void setMember(Member member){
        this.member = member;
    }

    public Member getMember () {
        return this.member;
    }

    public String getInfo() {
        return "��������:"+this.pname;
    }
}
class Child{

}
public class MemberCar {
    public static void  main (String args[]){
        Member m = new Member(1,"wang");
        Car c = new Car("��");
        Member chd = new Member(2,"xiaowang");
        Car cc = new Car("����");
        m.setCar(c); //һ������һ����
        c.setMember(m); // һ��������һ����
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);

        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());
        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());
    }
}
