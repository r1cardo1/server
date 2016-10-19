package theadServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EchoServer implements Runnable {

    @Override
    public void run() {
        try {
            ServerSocket m_ServerSocket = new ServerSocket(12111);
            int id = 0;
            while (true) {
                Socket clientSocket = m_ServerSocket.accept();
                System.out.println(clientSocket.getInetAddress().getHostAddress());
                ClientServiceThread cliThread = new ClientServiceThread(clientSocket, id++);
                cliThread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
