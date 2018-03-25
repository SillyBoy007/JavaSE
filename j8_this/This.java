package j8_this;

class Book{
	 String title;
	 double price;
	
	public Book(){}
	public Book(String title,double price){
		this.title = title;
		this.price = price;
	}
	
	public void getInfo () {
		System.out.println("图书名称"+this.title+"\n"+"价格:"+this.price);
	} 
}
public class This {

	public static void main(String[] args) {

		Book b = new Book("java",23.00);
		b.getInfo();
	}

}
