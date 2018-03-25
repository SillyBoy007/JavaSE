package j4_private;
//构造方法
class Car {
	public Car(){
		System.out.println("********");
	}
}
public class Constructor {
	public static void main (String args[]){
		Car car = null;
		car = new Car(); //构造方法在实例化对象的时候调用一次
	}
}
