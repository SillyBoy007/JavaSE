package j3_class;
class Book {  
	String title;
	double price;
	public void getInfo () {
		System.out.println("图书名称:"+title+"\n"+"图书价格:"+price);
	}
}
public class Object {
	public static void main (String args[]){
		Book bk = new Book();
		bk.title = "python开发:";
		bk.price = 23.00;
		bk.getInfo();		
	}
}