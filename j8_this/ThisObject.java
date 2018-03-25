package j8_this;

class Air{
	public void print(){
		System.out.println("*********"+this);
	}
}
public class ThisObject {

	public static void main(String[] args) {

		Air bookA = new Air();
		System.out.println(bookA);
		bookA.print();
		Air bookB = new Air();
		System.out.println(bookB);
		bookB.print();
	}

}
