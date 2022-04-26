package Homework6.Client;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final int PORT = 8190;

    public static void main(String[] args) {


        try (Socket socket = new Socket("localhost", PORT)){
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            new Thread(() -> {
                while (true) {
                    String message = in.nextLine();
                    if(message.startsWith("/end")){
                        try {
                            socket.close();
                        } catch (IOException e) {
                            System.out.println("GOODBYE!");
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Server: " + message);
                }
            }).start();

            while (true){
                String message = sc.nextLine();
                if(message.startsWith("/end")){
                    socket.close();
                    break;
                }
                out.println(message);

            }

        } catch (IOException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }
}
