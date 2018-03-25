package j36_numoperate;

import java.math.BigDecimal;

//BigDecimal 实现四舍五入

class MyMath{
    /**
     * 实现准确位数的四舍五入
     * @param num   要进行四舍五入操作的数字
     * @param scale 要保留的小数位
     * @return 处理后的四舍五入数字
     */

    public static double round(double num,int scale){
        BigDecimal bd = new BigDecimal(num);
        BigDecimal bd2 = new BigDecimal(1);
        return bd.divide(bd2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
public class TypeD {
    public static void main(String args[]){
        System.out.println(MyMath.round(19.78123213,2));
        System.out.println(MyMath.round(-15.5,0));
    }
}
