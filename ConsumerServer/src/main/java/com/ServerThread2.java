package com;

import com.client.Data;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerThread2 implements Runnable {
	


	private Socket client = null;

	public ServerThread2(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Server Thread - Start");
		try {
			ObjectInputStream in = new ObjectInputStream(client.getInputStream());
			Data data = (Data) in.readObject();
			ServerReadMessage srm = new ServerReadMessage();
			srm.readMessage(data);
			
			in.close();
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Server Thread - End");
	}
	


}