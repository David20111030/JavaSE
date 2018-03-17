package c_java_IO.Reader_Writer.a_OutputStreamReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class OutputStreamWriterDemo {
	
	/**
	 * 字符输出流： 
	 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
	 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流 把字节流转换为字符流。
	 * 						 字符流 = 字节流 +编码表。
	 */
	@Test
	public void testname() throws Exception {
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
		
		//写数据 写入的是字符数组或者是字符串
		osw.write("nisdf是我".toCharArray());
		osw.write("我就是字符串");
		//关闭流
		osw.close();
		
		
	}
	
	
	/**
	 * OutputStreamWriter的方法：
	 * 		public void write(int c):写一个字符
	 * 		public void write(char[] cbuf):写一个字符数组
	 * 		public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
	 * 		public void write(String str):写一个字符串
	 * 		public void write(String str,int off,int len):写一个字符串的一部分
	 * 
	 * 面试题：close()和flush()的区别?
	 * 		A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
	 * 		B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
	 */
	@Test
	public void test2() throws Exception {
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		//写数据
		//写一个字符
		osw.write('a');
		osw.write(97);
		
		// public void write(char[] cbuf):写一个字符数组
		 char[] chs = {'a','b','c','d','e'};
		 osw.write(chs);

		// public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
	     osw.write(chs,1,3);

		// public void write(String str):写一个字符串
		 osw.write("我爱林青霞");

		// public void write(String str,int off,int len):写一个字符串的一部分
		osw.write("我爱林青霞", 2, 3);		//释放资源
		
		//刷新缓冲区
		osw.flush();
		
		//释放资源
		osw.close();
		
		// java.io.IOException: Stream closed
		// osw.write("我爱林青霞", 2, 3);
		
		
		
	}
	
	
	
	
	
	/**
	 * 需求：把当前项目目录下的osw.txt内容复制到当前项目目录下的e3.txt中
	 * 
	 * 数据源：
	 * 		osw.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
	 * 目的地：
	 * 		e3.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
	 */
	@Test
	public void test3() throws Exception {
		//封装数据源
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		//封装目的地
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e3.txt"));
		
		//复制文件
		//第一种方式读取：读取一个字符数组就写入一个字节数组
		/*
		char[] chs = new char[1024];
		int len = 0;
		while((len = isr.read(chs))!=-1){
			osw.write(chs, 0, len);
		}*/
		
		//第二种方式，读取一个字符就写入一个字符
		int ch = 0;//存储读取到的字符所对应的ASCII编码值
		while((ch = isr.read())!=-1){
			osw.write((char)ch);
		}
		
		//刷新流
		osw.flush();
		//关闭流
		isr.close();
		osw.close();
		
	}
	
	
	
	
	
	
	
	
	
}
