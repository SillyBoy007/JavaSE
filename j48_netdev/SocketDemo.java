package j48_netdev;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketDemo {
    public static void main(String [] args) throws IOException {
        Socket client = new Socket("localhost",9999); //连接服务端
        Scanner scan = new Scanner(client.getInputStream()); //客户端的输入流对象
        scan.useDelimiter("\n");
        if (scan.hasNext()){
            System.out.println("回应数据"+scan.next());
        }
        scan.close();
        client.close();

    }
}
