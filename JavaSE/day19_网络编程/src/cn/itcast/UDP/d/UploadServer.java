package cn.itcast.UDP.d;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(12345);

		while (true) {
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
