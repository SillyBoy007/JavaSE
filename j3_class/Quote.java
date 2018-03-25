package j3_class;

class Book2 {  
	String title;
	double price;
	public void getInfo () {
		System.out.println("图书名称:"+title+"\n"+"价格:"+price);
	}
}
public class Quote {
	public static void main (String args[]){
		Book2 bkA = new Book2();
		Book2 bkB = null;
		bkA.title="java";
		bkA.price=20.00;
		bkA.getInfo();
		bkB = bkA;
		bkB.title="Python";
		bkA.getInfo();
				
	}
}
