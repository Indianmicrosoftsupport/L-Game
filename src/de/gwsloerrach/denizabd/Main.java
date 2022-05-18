package de.gwsloerrach.denizabd;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public final class Main {
    public static void main(final String[] args) {
        try {
            Socket socket = new Socket("localhost", 3333);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // send message to server
            dataOutputStream.writeUTF("Ping");

            // close connection
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Board board = new Board();
        GUI gui = new GUI(board);
    }
}
