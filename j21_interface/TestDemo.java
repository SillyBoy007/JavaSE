package j21_interface;

interface USB{
    public void start();
    public void stop();
}
class Computer implements USB{

    public void plugin(USB usb){
        usb.start();
        usb.stop();
    }
    public void start(){
        System.out.println("电脑开始使用");
    }
    public void stop() {
        System.out.println("电脑停止使用");
    }

}
class Print implements  USB{
    public void start(){
        System.out.println("打印机开始使用");
    }
    public void stop() {
        System.out.println("打印机停止使用");
    }
}
public class TestDemo {

    public static void main(String args[]){
        Computer com = new Computer();
        com.plugin(new Print());
        com.plugin(new Computer());
    }

}
