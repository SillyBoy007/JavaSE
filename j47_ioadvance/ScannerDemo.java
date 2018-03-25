package j47_ioadvance;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容:");
        if(scanner.hasNextDouble()){  //判断是否输入的数字
            double score = scanner.nextDouble();
            System.out.println("您的成绩是"+score);
        }
        if (scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")){ //输入的生日
            System.out.println("您的生日是"+scanner.next());
        }
        if (scanner.hasNext()){ //输入的生日
            System.out.println("你的输入有误");
        }
        scanner.close();
    }
}
