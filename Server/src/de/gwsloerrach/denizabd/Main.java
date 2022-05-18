package de.gwsloerrach.denizabd;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public final class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            System.out.println("Server started on port: " + serverSocket.getLocalPort());
            System.out.println("Waiting for players..");

            Socket player1 = serverSocket.accept();
            System.out.println("Player 1 connected!");
            Socket player2 = serverSocket.accept();
            System.out.println("Player 2 connected!");

            System.out.println("Game started!");

            // read input of player 1 (example)
            DataInputStream dataInputStream = new DataInputStream(player1.getInputStream());
            String input = dataInputStream.readUTF();
            System.out.println("Player1: " + input);

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));

            while (true) {
                // game loop
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
