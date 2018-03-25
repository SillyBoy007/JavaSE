package j40_reflect;

//反射工厂模式
interface Fruit{
    public void eat();
}

class Apple implements Fruit{
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit{
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
class Factory{
    public static Fruit getInstance(String className){
        /*if ("apple".equals(className)){
            return new Apple();
        }
        else if ("orange".equals(className)){
            return new Orange();
        }
        return null;*/
        Fruit f = null;
        try {
            f = (Fruit) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return f;
    }
}
public class TypeC {
    public static void main(String [] args){
        Fruit fu = Factory.getInstance("j40_reflect.Apple");
        fu.eat();
    }
}
