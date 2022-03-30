package de.gwsloerrach.denizabd;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public final class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            String input = dataInputStream.readUTF();
            System.out.println(input);

            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
