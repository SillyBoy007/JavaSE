package j37_date;

//Calendar适合日期计算
import java.util.Calendar;

public class TypeB {
    public static void main(String [] args){
        Calendar cal = Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        sb.append(cal.get(Calendar.YEAR)).append("-");
        sb.append(cal.get(Calendar.MONTH)+1).append("-");
        sb.append(cal.get(Calendar.DATE)).append("  ");
        sb.append(cal.get(Calendar.HOUR)).append(":");
        sb.append(cal.get(Calendar.MINUTE)).append(":");
        sb.append(cal.get(Calendar.SECOND));
        System.out.println(sb);

    }
}
