package c_java_IO.InputStream_OutpuStream.a_FileOutputStream_基本流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamDemo {
	
	
	/**
	 * IO流的分类：
	 * 		流向:
	 * 			输入流  读取数据
	 * 			输出流  写出数据
	 * 		数据类型:
	 *			字节流：
	 *				字节输入流  读取数据  InputStream
	 *				字节输出流	 写出数据  OutputStream
	 *			字符流： 	
	 * 				字符输入流  读取数据  Reader
	 * 				字符输出流	 写出数据  Writer
	 * 
	 * 注意：一般我们在探讨IO流的时候，如果没有明确说明按哪种分类来说，默认情况下是按照数据类型来分的。
	 * 
	 * 注意：每种基类的子类都是以父类名作为后缀名。
	 * 		XxxOutputStream
	 * 		XxxInputStream
	 * 		XxxReader
	 * 		XxxWriter
	 * 查看FileOutputStream的构造方法：
	 * 		FileOutputStream(File file) 
	 *		FileOutputStream(String name)
	 *
	 * 字节输出流操作步骤：
	 * 		A:创建字节输出流对象
	 * 		B:调用write()方法
	 * 		C:释放资源
	 * 	
	 * 字节输出流的Write()方法
	 * 	public void write(int b):写一个字节.实质上b就是代表你要输入的字符的ASCII码值
	 * 	public void write(byte[] b):写一个字节数组
	 * 	public void write(byte[] b,int off,int len):写一个字节数组的一部分
	 */
	@Test
	public void test1() throws Exception {
		//需求：我要往一个文本文件中输入一句话："hello,io"
		//创建字节输出流对象
		//File file = new File("fox.txt");
		//FileOutputStream fos = new FileOutputStream(file);
		//上面两行代码等价于下面这一行代码
		FileOutputStream fos = new FileOutputStream("fox.txt");
		/**
		 * 创建字节输出流对象做了几件事情呢？
		 * 		1、调用系统功能去创建文件
		 * 		2、创建fos对象
		 * 		3、把fos对象指向这个文件
		 */
		
		//写数据
		//public void write(byte[] bys);
		//public void write(int i);<=>这个方法也就等价于 public void write(char c);
		//public void write(byte[] bys,int index,int len);//index表示从该字节数组的那个位置开始，len表示要写入的字节个数
		fos.write("hello,io".getBytes());
		fos.write("java".getBytes(),1,2);
		fos.write(97);//97 -- 底层二进制数据	-- 通过记事本打开 -- 找97对应的字符值 -- a
		fos.write('a');
		/**
		 * fos.txt 中的写入的数据为  hello,ioavaa
		 */
		
		//释放资源
		//关闭此文件输出流并释放与此流有关的所有系统资源。
		fos.close();
		/**
		 * 为什么一定要close释放资源呢？
		 * 	1、让流对象变成垃圾，这样就可以被垃圾回收器回收了。
		 *  2、通知系统去释放跟该文件相关的资源。
		 */
		//java.io.IOException: Stream Closed
		//fos.write("java".getBytes());//注意：一旦释放资源，就不能对该字节输出流对象进行操作了
		
	}
	
	
	/**
	 * 如何实现数据的换行呢？
	 * 		写入换行符合即可。
	 * 
	 *  因为不同的系统针对不同的换行符号识别是不一样的?
	 * 		windows:\r\n
	 * 		linux:\n
	 * 		Mac:\r
	 * 		而一些常见的个高级记事本，是可以识别任意换行符号的。 	
	 * 
	 * 如何实现数据的追加写入？
	 * 		用构造方法带第二个参数是true的情况即可
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		//创建字节输出流对象  并且要实现数据的追加写入(用搞糟方法带第二个参数是true的情况即可)
		/**
		 *  创建一个向具有指定 名字 的文件中写入数据的输出文件流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
		 */
		FileOutputStream fos = new FileOutputStream("fos3.txt",true);
		
		//写数据 并且要换行
		for(int x = 0;x<10;x++){
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
		}
		//释放资源
		fos.close();
		/**fos.txt 文件中的数据是这样的
		 * hello0
			hello1
			hello2
			hello3
			hello4
			hello5
			hello6
			hello7
			hello8
			hello9
		 */
	}
	
	/**
	 * 加入异常处理的字节输出流操作
	 * @throws Exception
	 */
	@Test
	public void test_Exception() throws Exception {
		// 为了在finally里面能够看到该对象就必须定义到外面，为了访问不出问题，还必须给初始化值
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("fos4.txt");
			fos.write("javaee+j2ee".getBytes(), 0, 5);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//如果fos不是null，才需要close()
			if(fos!=null){
				//为了保证close()一定会执行，就放到这里
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
