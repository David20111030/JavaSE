package c_java_IO.Reader_Writer.d_LineNumberReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * 跟踪行号的缓冲字符输入流LineNumberReader。
 * 		
 * LineNumberReader是高效字符流BufferedReader的子类
 * BufferedReader
 * 		|--LineNumberReader的方法
 * 			public int getLineNumber()获得当前行号。 
 * 			public void setLineNumber(int lineNumber);设置当前行号
 * 			public String readLine();读取文本行，读取一行
 * 			public int read();读取单个字符
 * 
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("fw.txt"));

		// 从5开始才比较好
	    lnr.setLineNumber(5);

//		 System.out.println(lnr.getLineNumber());//5
//		 System.out.println(lnr.getLineNumber());//5
//		 System.out.println(lnr.getLineNumber());//5

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		/**
		 * 打印结果：
6:hello李贤元0
7:hello李贤元1
8:hello李贤元2
9:hello李贤元3
10:hello李贤元4
11:hello李贤元5
12:hello李贤元6
13:hello李贤元7
14:hello李贤元8
15:hello李贤元9

		 */
		 
		lnr.close();
	}
}