package cn.itcast.UDP.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
//���Ͷ�
public class UploadClient {
	public static void main(String[] args) throws IOException {
		// �����ͻ���Socket����
		Socket s = new Socket("lixian", 12345);

		// ��װ�ı��ļ�
		// BufferedReader br = new BufferedReader(new FileReader(
		// "InetAddressDemo.java"));
		BufferedReader br = new BufferedReader(new FileReader(
				"copy.java"));
		// ��װͨ������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // ����
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// Socket�ṩ��һ����ֹ������֪ͨ�����������ˣ���û�����ݹ�����
		s.shutdownOutput();

		// ���շ���
		BufferedReader brClient = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String client = brClient.readLine(); // ����
		System.out.println(client);

		// �ͷ���Դ
		br.close();
		s.close();
	}
}
