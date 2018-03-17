package c_java_IO.InputStream_OutpuStream.h_RandomAccessFile随机访问流;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileDemo {
	
	/**
	 * 随机访问流：
	 * 	RandomAccessFile类不属于流，是Object类的子类。
	 * 	但它融合了InputStream和OutputStream的功能。
	 * 	支持对文件的随机访问读取和写入。
	 * 
	 * public RandomAccessFile(String name,String mode);
	 * 			第一个参数是文件路径，第二个参数是操作文件的模式
	 * 	  模式有四种，我们最常用的一种叫"rw",这种方式表示既可以读数据，也可以写数据。如下:
	 * 		值		含意
			"r" 	以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。  
			"rw" 	打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。  
			"rws"	 打开以便读取和写入，对于 "rw"，还要求对文件的内容或元数据的每个更新都同步写入到底层存储设备。  
			"rwd"   打开以便读取和写入，对于 "rw"，还要求对文件内容的每个更新都同步写入到底层存储设备。 

	 * @throws Exception
	 */
	@Test
	public  void read() throws IOException {
		// 创建随机访问流对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		int i = raf.readInt();
		System.out.println(i);
		// 该文件指针可以通过 getFilePointer方法读取，并通过 seek 方法设置。
		System.out.println("当前文件的指针位置是：" + raf.getFilePointer());//返回此文件中的当前偏移量。

		char ch = raf.readChar();//从此文件读取一个字符。
		System.out.println(ch);
		System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

		String s = raf.readUTF();// 从此文件读取一个字符串。
		System.out.println(s);
		System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

		// 我不想重头开始了，我就要读取a，怎么办呢?
		raf.seek(4);//设置到此文件开头测量到的文件指针偏移量，在该位置发生下一个读取或写入操作。
		ch = raf.readChar();
		System.out.println(ch);
		
		
		//100a中国 字符串“中国“占8个字节
		
		/**
		 * 打印结果：
		 * 100
			当前文件的指针位置是：4
			a
			当前文件的指针位置是：6
			中国
			当前文件的指针位置是：14
			a

		 */
	}
	@Test
	public void write() throws IOException {
		// 创建随机访问流对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 怎么玩呢?
		raf.writeInt(100);//按四个字节将 int 写入该文件，先写高字节。
		raf.writeChar('a');//按双字节值将 char 写入该文件，先写高字节。
		raf.writeUTF("中国");//使用 modified UTF-8 编码以与机器无关的方式将一个字符串写入该文件。

		raf.close();
	}
}	
