package c_java_IO.InputStream_OutpuStream.g_System标准输入流_这个不太会;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import org.junit.Test;

public class SystemOutDemo {
	
	/**
	 * 标准输入输出流：
	 * 	System类中的两个成员变量：
	 * 		public static final InputStream in "标准"输入流
	 * 		public static final PrintStream out "标准"输出流
	 * 
	 * 
	 * 		InputStream is = System.in;
	 * 		PrintStream ps = System.out;	
	 * 
	 * 
	 * 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		// 有这里的讲解我们就知道了，这个输出语句其本质是IO流操作，把数据输出到控制台。
		System.out.println("helloworld");
		
		//获取标准输出流对象
		PrintStream ps = System.out;
		ps.print("hello");//等价于System.out.println("hello");
		
		ps.println();
		//ps.print();这个无参的方法不存在，需要带上参数的才存在
		
		System.out.println();
		
		
		
	}
	
	
	/**
	 * 转换流的应用：
	 * 		
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		// 获取标准输入流
		 // PrintStream ps = System.out;
		 // OutputStream os = ps;
		// OutputStream os = System.out; // 多态
		 // 我能不能按照刚才使用标准输入流的方式一样把数据输出到控制台呢?
		// OutputStreamWriter osw = new OutputStreamWriter(os);
		// BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("hello");
		bw.newLine();
		// bw.flush();
		bw.write("world");
		bw.newLine();
		// bw.flush();
		bw.write("java");
		bw.newLine();
		bw.flush();
		
		bw.close();	
		
	}
	
	
	/**
	 * System.in 标准输入流。是从键盘获取数据的
	 * 
	 * 键盘录入数据：
	 * 		A:main方法的args接收参数。
	 * 			java HelloWorld hello world java
	 * 		B:Scanner(JDK5以后的)
	 * 			Scanner sc = new Scanner(System.in);
	 * 			String s = sc.nextLine();
	 * 			int x = sc.nextInt()
	 * 		C:通过字符缓冲流包装标准输入流实现
	 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 */
	@Test
	public void test4() throws Exception {
		// //获取标准输入流
		// InputStream is = System.in;
		// //我要一次获取一行行不行呢?
		// //行。
		// //怎么实现呢?
		// //要想实现，首先你得知道一次读取一行数据的方法是哪个呢?
		// //readLine()
		// //而这个方法在哪个类中呢?
		// //BufferedReader
		// //所以，你这次应该创建BufferedReader的对象，但是底层还是的使用标准输入流
		// // BufferedReader br = new BufferedReader(is);
		// //按照我们的推想，现在应该可以了，但是却报错了
		// //原因是：字符缓冲流只能针对字符流操作，而你现在是字节流，所以不能是用?
		// //那么，我还就想使用了，请大家给我一个解决方案?
		// //把字节流转换为字符流，然后在通过字符缓冲流操作
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br= new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("请输入一个字符串：");
		String line = br.readLine();
		System.out.println("你输入的字符串是：" + line);

		System.out.println("请输入一个整数：");
		// int i = Integer.parseInt(br.readLine());
		line = br.readLine();
		int i = Integer.parseInt(line);
		System.out.println("你输入的整数是：" + i);
	}
	
	
}
