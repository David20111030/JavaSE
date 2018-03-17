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
 * @author ��Ԫ
 *
 */
public class NIODemo {
	/**
	 * nio����JDK4���֣��ṩ��IO���Ĳ���Ч�ʡ�
	 * 	
	 * 	JDK7֮���nio:
	 * 		Path:·��
	 * 		Paths����һ����̬��������һ��·��
	 * 			public static Path get(URI uri);
	 * 		Files:�ṩ�˾�̬����������ʹ��
	 * 			public static long copy(Path source,OutputStream out);�����ļ�
	 * 			
	 * 			public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset sc,OpenOption... options);
	 * 				���ı��ļ���д��һ��
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
