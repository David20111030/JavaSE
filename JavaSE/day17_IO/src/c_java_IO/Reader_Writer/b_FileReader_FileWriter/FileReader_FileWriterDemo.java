package c_java_IO.Reader_Writer.b_FileReader_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class FileReader_FileWriterDemo {
	
	
	
	/**
	 * 由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
	 * 而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
	 * OutputStreamWriter = FileOutputStream + 编码表(GBK)
	 * FileWriter = FileOutputStream + 编码表(GBK)
	 * 
	 * InputStreamReader = FileInputStream + 编码表(GBK)
	 * FileReader = FileInputStream + 编码表(GBK)
	 * 
	 * FileReader:用来读取字符文件的便捷类
	 * 		构造方法：
	 * 			FileReader(File file);//在给定从中读取数据的 File 的情况下创建一个新 FileReader。
	 * 			FileReader(FileDescriptor fd);在给定从中读取数据的 FileDescriptor 的情况下创建一个新 FileReader。
	 * 			FileReader(String fileName);在给定从中读取数据的文件名的情况下创建一个新 FileReader。	
	 * 
	 * 
	 * FileWriter:
	 * 		构造方法摘要 
			FileWriter(File file) 
          		根据给定的 File 对象构造一个 FileWriter 对象。 
			FileWriter(File file, boolean append) 
          		根据给定的 File 对象构造一个 FileWriter 对象。 
			FileWriter(FileDescriptor fd) 
          		构造与某个文件描述符相关联的 FileWriter 对象。 
			FileWriter(String fileName) 
          		根据给定的文件名构造一个 FileWriter 对象。 
			FileWriter(String fileName, boolean append) 
       	  		根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 
	 
	 
	 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
	 * 
	 * 数据源：
	 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader
	 * 目的地：
	 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter
	 */
	@Test
	public void test1() throws Exception {
		//封装数据源
		FileReader fr = new FileReader("fos3.txt");
		
		//封装目的地
		FileWriter fw = new FileWriter("fw.txt");
		
		//一次一个字符
		/*
		int ch = 0;
		while((ch = fr.read())!=-1){
			fw.write((char)ch);
		}*/
		
		
		//一次一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs))!=-1){
			fw.write(chs, 0, len);
		}
		
		
		//关闭流
		fr.close();
		fw.close();
	}
}
