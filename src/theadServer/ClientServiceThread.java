/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theadServer;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import oasis.sev.DataManager;

/**
 *
 * @author Ricardo Marcano
 */
public class ClientServiceThread extends Thread {
  Socket clientSocket;
  int clientID = -1;
  boolean running = true;
  DataManager dm  = new DataManager();

  ClientServiceThread(Socket s, int i) {
    clientSocket = s;
    clientID = i;
  }

  public void run() {
    System.out.println("Accepted Client : ID - " + clientID + " : Address - "
        + clientSocket.getInetAddress().getHostName());
      try {
          ObjectInputStream flujo = new ObjectInputStream(clientSocket.getInputStream());
          ObjectOutputStream salida = new ObjectOutputStream(clientSocket.getOutputStream());
          String opcion= flujo.readUTF();
          System.out.println(opcion);
      } catch (Exception ex) {
         ex.printStackTrace();
      }
  }
  
}
