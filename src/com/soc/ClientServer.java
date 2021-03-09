package com.soc;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServer {

    public static void main(String args[]) throws Exception {

        String ip ="localhost";
        int port = 9999;
        String str ="janith Chathuranga";


        Socket socket = new Socket(ip,port);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        printWriter.println(str);
        outputStreamWriter.flush();


    }

}
