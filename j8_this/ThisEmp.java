package j8_this;

class Emp{
	int enumb;
	String ename;
	double sal;
	String dept;
	
	public Emp(){
		this(0,"无名",0.0,"待定");
	}
	public Emp(int enumb){
		this(enumb,"清洁工",200.0,"临时工");
	}
	public Emp(int enumb,String ename){
		this(enumb,ename,5000.0,"开发");
	}
	public Emp(int enumb,String ename,double sal,String dept){
		this.enumb = enumb;
		this.ename = ename;
		this.sal   = sal;
		this.dept  = dept;
	}
	public void getInfo(){
		System.out.println("部门编号:"+this.enumb+"\n"+
			    "名字:"+this.ename+"\n"+
				"基本工资:"+this.sal+"\n"+
			    "部门:"+this.dept+"\n"+
				"=====================");
	}
}
public class ThisEmp {
	public static void main (String args[]){
		Emp ea = new Emp(1001);
		ea.getInfo();
		Emp eb = new Emp(1002,"wang");
		eb.getInfo();
		Emp ec = new Emp(1004,"yun",20.00,"销售");
		ec.getInfo();
	}
}
