package j46_printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//printf
public class TypeC {
    public static void main(String [] args) throws FileNotFoundException {
        String name = "wag";
        int age = 23;
        double score = 19.22;
        PrintStream printStream = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"demo"+File.separator+"b.txt")));

        printStream.printf("姓名:%s,年龄:%d,成绩:%5.2f",name,age,score); //jdk5输出
        printStream.close();
    }
}
