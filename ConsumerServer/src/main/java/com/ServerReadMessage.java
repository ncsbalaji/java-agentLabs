package com;

import com.client.Data;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerReadMessage {

	public void readMessage(Data data) throws IOException, ClassNotFoundException {
		try {
			Thread.sleep(1200);

			Thread httpThread = new Thread(new HttpThread());
			httpThread.start();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String messageReceived = data.getMessage();

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		System.out.println(System.currentTimeMillis());
		System.out.println("message" + messageReceived);
		System.out.println("header" + data.getHeader());
		

	}
}
