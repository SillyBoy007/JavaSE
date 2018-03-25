package j21_interface;

interface D{
    public void funA();
}
interface E {
    public void funB();
}
interface F extends D,E{ //C同时继承A和B
    public void funC();
}
class Y implements F {
    public void funA(){}
    public void funB(){}
    public void funC(){}
}
public class TypeTwo {
    public static void main(String args[]){

    }
}
