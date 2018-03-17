package cn.itcast.TCP.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端就是发送端
/**
 * 客户端键盘录入，服务器输出到控制台
 * @author 贤元
 *
 */
public class SendDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建发送端Socket对象
		Socket s = new Socket("lixian",22222);
		
		//键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//把通道内的流给包装一下（高效字符流）
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line= null;
		while((line = br.readLine()) != null){
			//键盘录入数据要自定义结束标记
			if("886".equals(line)){
				break;
			}
			
			bw.write(line);
		    bw.newLine();
		    bw.flush();
			
		}
		
		s.shutdownOutput();
		
		//读取反馈
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		String receive = new String(bys2,0,len2);
		System.out.println(receive);
		
		
		//释放资源
		//bw.close();
		//bw.close();
		s.close();
	}
}
