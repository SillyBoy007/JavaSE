package j20_abstract;

abstract class Action{
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 7;
    public void command(int flag){
        switch(flag){
            case EAT:
                this.eat();
                break;

            case SLEEP:
                this.sleep();
                break;

            case WORK:
                this.work();
                break;

            case EAT+WORK:
                this.eat();
                this.work();
                break;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}

class Robot extends Action{
    public void eat(){
        System.out.println("机器人充电");
    }
    public void sleep(){}
    public void work(){
        System.out.println("机器人在工作");
    }
}

class Human extends Action{
    public void eat(){
        System.out.println("人在吃饭");
    }
    public void sleep(){
        System.out.println("人在睡觉");
    }
    public void work(){
        System.out.println("人在工作");
    }
}
class Pig extends Action{
    public void eat(){
        System.out.println("pig在吃饭");
    }
    public void sleep(){
        System.out.println("pig在睡觉");
    }
    public void work(){
    }
}

public class Use {
    public static void main(String args[]){
        fun(new Human());
        System.out.println("=======================================");
        fun(new Pig());
    }
    public static void fun(Action act){
        act.command(Action.EAT);
        act.command(Action.SLEEP);
        act.command(Action.WORK);
    }
}
