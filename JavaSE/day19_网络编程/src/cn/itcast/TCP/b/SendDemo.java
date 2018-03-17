package cn.itcast.TCP.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ��˾��Ƿ��Ͷ�
/**
 * �ͻ��˼���¼�룬���������������̨
 * @author ��Ԫ
 *
 */
public class SendDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//�������Ͷ�Socket����
		Socket s = new Socket("lixian",22222);
		
		//����¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��ͨ���ڵ�������װһ�£���Ч�ַ�����
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line= null;
		while((line = br.readLine()) != null){
			//����¼������Ҫ�Զ���������
			if("886".equals(line)){
				break;
			}
			
			bw.write(line);
		    bw.newLine();
		    bw.flush();
			
		}
		
		s.shutdownOutput();
		
		//��ȡ����
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		String receive = new String(bys2,0,len2);
		System.out.println(receive);
		
		
		//�ͷ���Դ
		//bw.close();
		//bw.close();
		s.close();
	}
}
