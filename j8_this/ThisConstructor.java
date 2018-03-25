package j8_this;


class Plane{
	 String title;
	 double price;
	
	public Plane(){
		System.out.println("无参构造");
	}
	public Plane(String title){
		this();
		this.title = title;
	}
	public Plane(String title,double price){
		this(title);
		System.out.println("2参构造");
		this.title = title;
		this.price = price;
	}
	
	public void getInfo () {
		System.out.println("图书名称"+this.title+"\n"+"价格:"+this.price);
	} 
}
public class ThisConstructor {

	public static void main(String[] args) {

		Plane p = new Plane("java",23.00);
		p.getInfo();
	}

}
