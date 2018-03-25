package j47_ioadvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TypeA {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(new File("d:"+File.separator+"demo"+File.separator+"my.txt")));
        scanner.useDelimiter("\n");//设置读取分隔符
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
