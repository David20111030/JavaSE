package c_java_IO.InputStream_OutpuStream.k_nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * 
 * @author 贤元
 *
 */
public class NIODemo {
	/**
	 * nio包在JDK4出现，提供了IO流的操作效率。
	 * 	
	 * 	JDK7之后的nio:
	 * 		Path:路径
	 * 		Paths：有一个静态方法返回一个路径
	 * 			public static Path get(URI uri);
	 * 		Files:提供了静态方法供我们使用
	 * 			public static long copy(Path source,OutputStream out);复制文件
	 * 			
	 * 			public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset sc,OpenOption... options);
	 * 				往文本文件中写入一行
	 * 
	 * 	
	 * @param args
	 * @throws IOException 
	 */
	@Test
	public void test1() throws IOException {
		
		// public static long copy(Path source,OutputStream out)
		Files.copy(Paths.get("fox.txt"), new FileOutputStream("nio.txt"));

		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
		
		
	}
}
