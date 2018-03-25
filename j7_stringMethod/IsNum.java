package j7_stringMethod;

public class IsNum {

	public static void main(String[] args) {

		String str = "23232";
		
		if (isNum(str)){
			System.out.println("该字符串由数字组成");
		}else{
			System.out.println("该字符串不是由数字组成");
		}
	}
	public static boolean isNum(String tmp){
		char data [] = tmp.toCharArray();
		for (int x=0;x<data.length;x++){
			if (data[x]>'9' || data[x]<'0'){
				return false;
			}
		}
		return true;
	}

}
