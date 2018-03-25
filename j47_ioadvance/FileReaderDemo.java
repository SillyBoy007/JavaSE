package j47_ioadvance;

import java.io.*;

public class FileReaderDemo {
    public static void main(String [] args) throws IOException {
        File file = new File("d:"+File.separator+"demo"+File.separator+"wang.txt");
        BufferedReader buf = new BufferedReader(new FileReader(file));
        while (buf.readLine() != null){
            System.out.println(buf.readLine());
        }

        buf.close();
    }
}
