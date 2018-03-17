package c_java_IO.InputStream_OutpuStream.a_FileInput_OutputStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class CopyDemo {
	
	/**
	 * 一个案例：复制文本文件
	 * 	 数据源：从哪里来 (不添加盘符默认是相对路径，该文件在本项目路径下)
	 * 		b.txt --读取数据 --FileInputStream
	 *  目的地：到哪里去
	 * 	 	d:\b.txt	-- 写数据 -- FileOutputStream
	 * 
	 * java.io.FileNotFoundException: a.txt (系统找不到指定的文件。) 
	 * 
	 * 
	 * 这一次复制中文没有出现任何问题，为什么呢?
	 * 		上一次我们出现问题的原因在于我们每次获取到一个字节数据，就把该字节数据转换为了字符数据，然后输出到控制台。
	 * 		而这一次呢?确实通过IO流读取数据，写到文本文件，你读取一个字节，我就写入一个字节，你没有做任何的转换。
	 * 		它会自己做转换。
	 * 
	 *   其他类型的文件的复制都是类似的，值不过是改个文件名而已！！！！！！！！
	 *
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		//封装数据源
		FileInputStream fis = new FileInputStream("b.txt");
		
		//封装目的地
		FileOutputStream fos = new FileOutputStream("d:\\a.txt");//表示追加的形式写入数据
		
		//复制文本文件
		//使用读取一个字节就写入一个字节的方式
		//推荐使用这种方式，这种方式即使有中文也不会出现乱码
		int by = 0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		
		
		//复制文本文件
		//使用读取一个字节数组就写入一个字节数组的方式
		//不推荐这种方式，这种方式有中文的时候会出现乱码
		/*byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1){
			fos.write(bys,0,len);//这里写入的时候要控制写入，可能写入的数据容量没有刚好1024个字节
		}*/
		
		
		//释放资源
		fis.close();
		fos.close();
	}
	
	
	
	/**
	 * 需求：把 闹铃.mp3 复制到d盘中
	 *  数据源：
	 *  	闹铃.mp3
	 *  目的地：
	 *  	d:\\copy.mp3
	 */
	@Test
	public void test2() throws Exception {
		//封装数据源
		FileInputStream fis = new FileInputStream("闹铃.mp3");
		
		//封装目的地
		FileOutputStream fos = new FileOutputStream("d:\\copy.mp3");
		
		//开始复制
		//使用读取一个字节就写入一个字节的方式复制，因为这样即使出现中文也不会出现乱码
		int by = 0;
		while((by = fis.read()) != -1){
			fos.write(by);
		}
		
		//释放资源
		fis.close();
		fos.close();
		
	}
	
	
	
	/*
	 * 计算机是如何识别什么时候该把两个字节转换为一个中文呢?
	 * 在计算机中中文的存储分两个字节：
	 * 		第一个字节肯定是负数。
	 * 		第二个字节常见的是负数，可能有正数。但是没影响。
	 */
	@Test
	public void test_question() throws Exception {
		 String s = "abcde";
		// // [97, 98, 99, 100, 101]

		//String s = "我爱你中国";
		// [-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
	}
	
	
}
