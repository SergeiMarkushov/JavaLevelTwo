package Homework6.Server;



import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static final int PORT = 8190;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Server is working...");
            Socket socket = server.accept();
            System.out.println("Client on");


            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            new Thread(() -> {
                while (true) {
                    String message = sc.nextLine();
                    if (message.startsWith("/end")){
                        try {
                            socket.close();
                            server.close();
                        }catch (IOException e){
                            System.out.println("GOODBYE");
                            e.printStackTrace();
                        }
                    }else {
                        out.println(message);
                    }
                }
            }).start();

            while (true) {
                String message = in.nextLine();
                if (message.startsWith("/end")) {
                    socket.close();
                    server.close();
                    break;
                }
                System.out.println("Client: " + message);
            }


        } catch (IOException e) {
            System.err.println("Error");
            e.printStackTrace();
        }

        }
    }
