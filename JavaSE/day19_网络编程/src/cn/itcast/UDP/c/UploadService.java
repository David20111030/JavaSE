package cn.itcast.UDP.c;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadService {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建客户端Socket对象
		Socket s = new Socket("lixian",11111);
		
		//封装文本文件
		BufferedReader br = new BufferedReader(new FileReader("address.txt"));
		
		//封装通道内流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){//阻塞
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//Socket提供了一个终止，他会通知服务器你别等了，我有数据过来了
		s.shutdownOutput();
		
		//接收反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String client= brClient.readLine();//阻塞
		System.out.println(client);
		
		//释放资源
		br.close();
		s.close();
	}
}
