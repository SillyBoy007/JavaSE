package j46_printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TypeB {
    public static void main (String [] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"my.txt")));
        printStream.println("hello");
        printStream.println(1+1);
        printStream.println(2.33+6.22);
        printStream.close();

    }
}
