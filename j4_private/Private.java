package j4_private;

class Book {
	
	private String title;
	private double price;
	
	public Book(){}
	public Book(String t,double p) {
		title = t;
		price = p;
	}
	
	public void setTitle(String t){
		title = t;
	}
	public String getTitle(){
		return title;
	}	
	
	public void setPrice(double p){
		price = p;
	}
	public double getPrice(){
		return price;
	}
	public void getInfo () {
		System.out.println("图书名称:"+title+"\n"+"价格:"+price);
	}
}
public class Private {
	public static void main (String args[]){
		Book bk = new Book("js",23.00);
		bk.getInfo();
		
	}
}
