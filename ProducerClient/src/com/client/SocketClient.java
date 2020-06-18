package com.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient
{

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException
    {
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        while(true)
        {
            sendRequestFromClient(host);
        }
    }

    private static void sendRequestFromClient(InetAddress host) throws IOException, InterruptedException
    {
        Socket socket;
        ObjectOutputStream oos;//establish socket connection to server
        socket = new Socket(host.getHostName(), 20006);
        //write to socket using ObjectOutputStream
        oos = new ObjectOutputStream(socket.getOutputStream());
        System.out.println("Sending request to Socket Server");
        Data data = new Data();
        data.setMessage("hi Msg from client");
        oos.writeObject(data);
        //read the server response message
            /*ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);*/
        //close resources
        //ois.close();
        oos.close();
        Thread.sleep(1500);
    }
}


