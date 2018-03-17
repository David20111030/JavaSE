package c_java_IO.Reader_Writer.a_InputStreamReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

public class InputStreamReaderDemo {

	/**
	 * 字符输入流：
	 * InputStreamReader(InputStream in);用默认的编码读取数据
	 * InputStreamReader(InputStream in,String charsetName);用指定的编码读取数据
	 * 
	 *注意：读取和写入的编码格式要一样，不然会有乱码的。默认编码为GBK编码
	 * 
	 * InputStreamReader的方法：
	 * 		int read():一次读取一个字符
	 * 		int read(char[] chs):一次读取一个字符数组
	 */
	@Test
	public void test1() throws Exception {
		//创建对象  用默认编码读取数据
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		//InputStreamReader(InputStream in,String charsetName);用指定的编码读取数据
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"GBK");
		
		//读取数据  方法的用法和字节流的一样的
		//一次读取一个字符
		/*
		int ch = 0;
		while((ch = isr.read())!=-1){
			System.out.println((char)ch);
		}*/
		
		//一次读取一个字符数组
		char[] chs = new char[1024];//存储本次读取的字符内容
		int len = 0;//本次读取的字符个数
		while((len = isr.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
		
		//释放资源
		isr.close();
		
		
	}
}
