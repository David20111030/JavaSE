package c_java_IO.InputStream_OutpuStream.a_FileInputStream_基本流;

import java.io.FileInputStream;

import org.junit.Test;

public class FileInputStreamDemo {

	/**
	 * 字节输入流操作步骤：
	 * 	1、创建字节输入流对象
	 *  2、调用read()方法读取数据，并把数据显示在控制台
	 *  3、释放资源
	 *  
	 *  读取数据的方式：
	 *  	A： int read();一次读取一个字节  返回值表示该字符对应的ASCII码值
	 *      B： int read(byte[] b);一次读取一个字节数组。从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
	 *      				返回值其实是本次实际读取的字节个数。bys存放的是本次读取到的数据(以字节的形式存储的)
	 *      C： int read(byte[] bys,int index,int len);从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("fos4.txt");
		
		//调用read()方法读取数据，并把数据显示在控制台中
		// int read(); 一次读取一个字符
		int by = 0;
		/*while((by = fis.read())!=-1){
			System.out.print((char)by+" ");//j a v a e
			System.out.print(by+" ");//106 97 118 97 101 
		}*/
		
		System.out.println("----------一次读取一个字节数组------------");
		
		// int read(byte[] bys);一次读取一个字节数组. 返回值其实是本次实际读取的字节个数。bys存放的是本次读取到的数据(以字节的形式存储的)
		// 数组的长度一般是1024或者1024的整数倍
		/*byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));//javae
			System.out.println(bys);//[B@30307ae3 该字节数组bys的内存地址，里面存储着本次读取到的数据(以字节形式存储的)
			System.out.println(len);//5
		}*/
		
		
		//int read(byte[] bys,int index,int len);从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
		//也就是这个可以控制一次最多读取几个字节的数据
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys,0,2))!=-1){
			System.out.print(new String(bys,0,len)+" ");//ja va e 
			System.out.println(bys);
			//[B@30307ae3  [B@30307ae3   [B@30307ae3 该字节数组bys的内存地址，里面存储着本次读取到的数据(以字节形式存储的)
			System.out.println(len);//2 2 1  总共读取了三次
		}
		
		
		
		
		//释放资源
		fis.close();
	}
}
