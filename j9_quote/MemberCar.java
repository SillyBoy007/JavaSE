package j9_quote;
//引用实现人车关系传递
class Member{
    private int mid;
    private String name;
    private Car car; //表示属于人的车
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
        return  "人员编号:" + this.mid+"\n"+
                "人员姓名:" + this.name;
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
        return "车的名字:"+this.pname;
    }
}
class Child{

}
public class MemberCar {
    public static void  main (String args[]){
        Member m = new Member(1,"wang");
        Car c = new Car("大奔");
        Member chd = new Member(2,"xiaowang");
        Car cc = new Car("大众");
        m.setCar(c); //一个人有一辆车
        c.setMember(m); // 一辆车属于一个人
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);

        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());
        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());
    }
}
