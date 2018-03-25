package j46_printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TypeD {
    public static void  main(String [] args) throws FileNotFoundException {
        String name = "wag";
        int age = 23;
        double score = 19.22;
        String str = String.format("姓名:%s,年龄:%d,成绩:%5.2f",name,age,score);
        System.out.println(str);
    }
}
