package aufgabeThread5;
import java.net.*;
import java.io.*;
public class ServerClass extends Thread {
    public static int port = 1000;

    @Override
    public void run(){
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while(true){
            System.out.println("Warte auf Clients!");

            try {
                Socket socket = server.accept();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Server: Verbunden!");


        }

    }

/*
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(port);

        while(true){
            System.out.println("Warte auf Clients!");

            Socket socket = server.accept();

            System.out.println("Server: Verbunden!");


        }

    }
*/
}
