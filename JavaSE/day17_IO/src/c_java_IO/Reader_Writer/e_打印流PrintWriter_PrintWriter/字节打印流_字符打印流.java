package c_java_IO.Reader_Writer.e_打印流PrintWriter_PrintWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.junit.Test;

public class 字节打印流_字符打印流 {
	
	/**
	 * 打印流：
	 * 	  字节流打印流：	PrintStream
	 * 	 字符打印流：PrintWriter
	 * 
	 * 打印流的特点：
	 * 		A：只有写数据的，没有读取数据。只能操作目的地，不能操作数据源
	 *      B：可以操作任意类型的数据
	 *      C:如果启动了自动刷新，能够自动刷新
	 *      	哪些流对象是可以直接操作文本文件的呢？
	 *      		FileInputStream
	 *      		FileOutputStream
	 *      		FileReader
	 *      		FileWriter
	 *      		PrintStream
	 *      		PrintWriter
	 * 看API，查流对象的构造方法，如果同时又File类型和String类型的参数，一般来说是可以直接操作文件的。
	 * 
	 *		流：
	 *			基本流：就是能够直接读写文件的
	 *			高级流：在基本流基础上提供了一些其他的 功能
	 * 
	 * 
	 * 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//作为Writer的子类使用
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("j2ee");
		
		pw.close();
		
	}
	
	
	/**
	 * 1、可以操作任意类型的数据
	 * 		print();
	 * 		println();
	 * 2、启动自动刷新
	 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
	 * 		还是应该调用pringln()的方法才可以
	 * 		这个时候不仅仅自动刷新了，还实现了数据的换行
	 * 		
	 * 		println()其实等价于bw.wirter();bw.newLine();bw.flush();
	 * 		
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		//创建打印流对象
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"));
		
		// write()是搞不定的，怎么办呢?
		// 我们就应该看看它的新方法
		
		//使用print()或println()可以写入各种基本类型的数据
		pw.println("hello");
		pw.println(true);
		pw.println(100);

		pw.close();
	}
	
	/**
	 * 一个案例：
	 * 
	 * 需求：DataStreamDemo.java复制到Copy.java中
	 * 数据源：
	 * 		DataStreamDemo.java -- 读取数据 -- FileReader -- BufferedReader
	 * 目的地：
	 * 		Copy.java -- 写出数据 -- FileWriter -- BufferedWriter -- PrintWriter
	 */
	@Test
	public void test2() throws Exception {
		//这回要使用打印流的改进版了
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("fw.txt"));
		
		
		//封装目的地
		PrintWriter pw = new PrintWriter(new FileWriter("copy.java"));
		
		//进行复制
		String line = null;
		while((line = br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}
