package j5_array;

class Book{
	private String title;
	private double price;

	public Book(String t,double p){
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
	public String getInfo(){
		return "图书名称:"+title+" "+
			   "价格:"+price+"\n";
	}
}
public class ObjectArray {
	public static void main(String args[]){
		Book books[] = new Book[3];
		books[0] = new Book("java",23.00);
		books[1] = new Book("js",24.00);
		books[2] = new Book("Python",26.00);
		for(int x=0;x<books.length;x++){
			System.out.print(books[x].getInfo());
		}
	}
}
