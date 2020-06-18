package com;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception {
		Server1 s = new Server1();
		ServerSocket server = new ServerSocket(20006);
		Socket client = null;
		boolean f = true;
		while (f) {
			s.runServer(server, client);
		}
		server.close();
	}
	
	public void runServer(ServerSocket server, Socket client) throws IOException {	
			client = server.accept();
			System.out.println("connect client success！");
			new Thread(new ServerThread2(client)).start();
	}
}
