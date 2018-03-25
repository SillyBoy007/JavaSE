package j36_numoperate;

import java.math.BigInteger;
//BigInteger大整数类
public class TypeC {
    public static void main(String [] args){
        System.out.println(Double.MAX_VALUE * Double.MAX_VALUE );

        BigInteger bi = new BigInteger("12333333333333333333333333334234232344");
        BigInteger bi2 = new BigInteger("1123123");
        System.out.println(bi.add(bi2)); //加法
        System.out.println(bi.subtract(bi2)); //减法
        System.out.println(bi.multiply(bi2)); //乘法
        System.out.println(bi.divide(bi2)); //除法
    }
}
