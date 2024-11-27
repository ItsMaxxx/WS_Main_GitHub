package aufgabeThread5;
import java.net.*;
import java.io.*;

public class ClientClass extends Thread{


    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 1000);
            System.out.println("Client: Verbunden!");

            int i = 0;
            while(true){
                System.out.println(i);
                i++;
                sleep(300);
            }


        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }
/*

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 1000);

        System.out.println("Client: Verbunden!");
    }
*/

}
