package c_java_IO.InputStream_OutpuStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class 解决字节流读取中文时出现的小问题 {
	
	/**
	 * 用这种方式就不会出现中文乱码了！
	 * 
	 *  String(byte[] bytes, String charsetName):通过指定的字符集解码字节数组
	 *  byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
	 * 
	 * 编码:把看得懂的变成看不懂的
	 * String -- byte[]
	 * 
	 * 解码:把看不懂的变成看得懂的
	 * byte[] -- String
	 * 
	 * 举例：谍战片(发电报，接电报)
	 * 
	 * 码表：小本子
	 * 		字符	数值
	 * 
	 * 要发送一段文字：
	 * 		今天晚上在老地方见
	 * 
	 * 		发送端：今 -- 数值 -- 二进制 -- 发出去
	 * 		接收端：接收 -- 二进制 -- 十进制 -- 数值 -- 字符 -- 今
	 * 
	 * 		今天晚上在老地方见
	 * 
	 *    new String(byte[] bys,int index,int length,String charsetName);
	 *    			charsetName:表示编码
	 * 
	 * 编码问题简单，只要编码解码的格式是一致的。用这种方式就不会出现中文乱码了！
	 */
	@Test
	public void testname() throws Exception {
		//创建数据源
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ques.txt"));
		//写入数据
		bos.write("sdf士大夫孙大发".getBytes("GBK"));//并指定写入的字符集
		//关闭流
		bos.close();
		
		//创建数据源
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("ques.txt"));
		//读取数据 以一次读取一个字节数组的方式读取  
		byte[] bys = new byte[1024];
		int len = 0;
		while( (len = bis.read(bys))!=-1){
			System.out.println(new String(bys,0,len,"GBK"));
		}
		//关闭流
		bis.close();
	}
	
	
	@Test
	public void testname1() throws Exception {
		String s = "你好";

		// String -- byte[]
		byte[] bys = s.getBytes(); // [-60, -29, -70, -61]
		// byte[] bys = s.getBytes("GBK");// [-60, -29, -70, -61]
		// byte[] bys = s.getBytes("UTF-8");// [-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

		// byte[] -- String
		String ss = new String(bys); // 你好
		// String ss = new String(bys, "GBK"); // 你好
		// String ss = new String(bys, "UTF-8"); // ???
		System.out.println(ss);
	}
}
