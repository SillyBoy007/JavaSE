package j8_this;
//this
class Car{
	 String title;
	 double price;
	
	public Car(){}
	public Car(String title,double price){
		this.title = title;
		this.price = price;
	}
	public void print(){
		System.out.println("************");
	}
	public void getInfo () {
		this.print();
		System.out.println("图书名称:"+this.title+"\n"+"价格:"+this.price);
	} 
}
public class ThisMethod {

	public static void main(String[] args) {

		Car c = new Car("��",2333.00);
		c.getInfo();
	}

}
