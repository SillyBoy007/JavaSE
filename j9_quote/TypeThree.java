package j9_quote;
//
class Msg{
	private String info = "nihao";
	public Msg(String info){
		this.info = info;
	}
	public void setInfo(String info){
		this.info = info;
	}
	public String getInfo(){
		return this.info;
	}
}
public class TypeThree {

	public static void main(String[] args) {
		Msg msg = new Msg("hello");
		fun(msg);
		System.out.println(msg.getInfo());
	}
	public static void fun(Msg temp){
		temp.setInfo("world"); //
	}
}
