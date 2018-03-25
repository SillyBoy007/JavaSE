package j8_this;

class A{
	private B b;
	public A(){
		this.b = new B(this);
		this.b.get();
	}
	public void print(){
		System.out.println("Hello,world");
	}
}
class B{
	private A a;
	public B(A a){
		this.a = a;
	}
	public void get(){
		this.a.print();
	}
}
public class Think {

	public static void main(String[] args) {
		A temp = new A();
	}

}
