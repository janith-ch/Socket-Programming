package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String args[]) throws Exception{

        System.out.println("Socket Server is start");

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server is waiting for client request");

        Socket socket = serverSocket.accept();
        System.out.println("Client Connected");


        InputStreamReader inputStreamReader =new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        System.out.println("client data "+str);



    }

}
