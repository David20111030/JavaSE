package c_java_IO.Reader_Writer.c_BufferedReader_BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferedReader_BufferedWriterDemo {
	
	/**
	 * 构造方法：
	 * BufferedWriter(Writer out);
	 * BufferedReader(Reader in);
	 * 
	 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。
	 * 
	 * 字符缓冲流的特殊方法：
	 * 	BufferedWriter:
	 * 		public void newLine();根据系统来决定换行符
	 *  BufferedReader:
	 *  	public String readLine();一次读取一行数据
	 *  	public void newLine();写入一个行分隔符，也就是换行
	 *  			包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		//read();
		write();
	}
	/**
	 * BufferedReader
	 * 	从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 
	 * 	可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了。 
	 * 
	 * BufferedReader(Reader in)
	 */
	public static void read() throws IOException{
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("fw.txt"));
		
		//读取方式1
		//public String readLine();//一次读取一行数据
		/*String line = null;//用来存储一次读取到的一行数据
		while((line = br.readLine())!=null){
			System.out.println(line);
		}*/
		
		//读取方式2
		//一次读取一个字符
		/*int ch = 0;//存储读取到的字符的ASCII码制
		while((ch = br.read())!=-1){
			System.out.println((char)ch);
		}*/
		
		//读取方式3
		//一次读取一个字符数组
		char[] chs = new char[1024];//存储每一次读取到的字符内容
		int len = 0;//存储每次读取到的字符个数
		while((len = br.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
		
		
		//释放资源
		br.close();
	}
	/**
	 * void write(char[] chs);写入一个字符数组
	 * void write(char[] cbuf, int off, int len) 
          	写入字符数组的某一部分。 
 		void write(int c) 
          	写入单个字符。 
 		void write(String s, int off, int len) 
          	写入字符串的某一部分。 
         void wirte(String s);写入一个字符串 	
	 * @throws Exception
	 */
	/**
	 * 字符流为了高效读写，也提供了对应的字符缓冲流。
	 * 		BufferedWriter:字符缓冲输出流
	 * 		BufferedReader:字符缓冲输入流
	 * 
	 * BufferedWriter:字符缓冲输出流
	 * 		将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
	 * 		可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
	 */
	public static void write() throws Exception{
		//创建字符缓存输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		//写入数据
		for(int x = 0; x < 10; x++){
			bw.write("hello李贤元"+x);
			bw.newLine();//换行
			bw.flush();//刷新
		}
		
		
		//关闭流
		bw.close();
		
	}
	
	
	
	
	/**
	 * 一个练习
	 * 需求：把当前项目目录下的bw.txt内容复制到当前项目目录下的fw.txt中
	 * 
	 */
	@Test
	public void test3() throws Exception {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("fw.txt"));

		// 读写数据
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
		br.close();
	}
	
	
}
